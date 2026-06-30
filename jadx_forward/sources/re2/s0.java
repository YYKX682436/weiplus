package re2;

/* loaded from: classes15.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14184xa1edf579 f476016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f476017e;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14184xa1edf579 activityC14184xa1edf579, int i17) {
        this.f476016d = activityC14184xa1edf579;
        this.f476017e = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/colive/FinderLiveCoLiveInvitationErrorUI$bindActionButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14184xa1edf579 activityC14184xa1edf579 = this.f476016d;
        int i17 = this.f476017e;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1481xaf3ea758.ActivityC14184xa1edf579.f193077n;
        if (i17 == -200460) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveInvitationErrorUI", "onActionButtonClicked: enter create-and-live flow, spamJumpUrl=" + activityC14184xa1edf579.f193084m);
            int i19 = activityC14184xa1edf579.f193083i;
            java.lang.String str = activityC14184xa1edf579.f193084m;
            re2.f0.f475940a = i19;
            re2.f0.f475941b = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveCreateAccountFlow", "start: userFlag=" + i19 + ", spamJumpUrl=" + str);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_router_to_profile", false);
            intent.putExtra("key_create_scene", 3);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).rj(activityC14184xa1edf579, intent, 32272);
        } else if (i17 != -200008) {
            activityC14184xa1edf579.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.CoLiveInvitationErrorUI", "onActionButtonClicked: unhandled errorCode=" + i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveInvitationErrorUI", "onActionButtonClicked: enter realname-only flow, spamJumpUrl=" + activityC14184xa1edf579.f193084m);
            java.lang.String str2 = activityC14184xa1edf579.f193084m;
            re2.w0 w0Var = new re2.w0(activityC14184xa1edf579);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveCreateAccountFlow", "startRealnameOnly: spamJumpUrl=" + str2);
            if (str2 == null || str2.length() == 0) {
                w0Var.mo152xb9724478();
            } else {
                re2.f0.f475940a = 0;
                re2.f0.f475941b = str2;
                android.content.Intent intent2 = new android.content.Intent(activityC14184xa1edf579, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15041xa4ea2f4.class);
                intent2.putExtra("LIVE_HELP_TYPE", 1);
                intent2.putExtra("FACE_VERIFY_URL", str2);
                intent2.putExtra("SKIP_INTERMEDIATE_PAGE", true);
                intent2.putExtra("PRECHECK_TYPE", 5);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveCreateAccountFlow", "launchFaceVerify: verifyUrl=" + str2);
                activityC14184xa1edf579.startActivityForResult(intent2, 32274);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/colive/FinderLiveCoLiveInvitationErrorUI$bindActionButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
