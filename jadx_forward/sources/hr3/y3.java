package hr3;

/* loaded from: classes8.dex */
public final class y3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f365732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 f365733e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p670x38b72420.o f365734f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028, com.p314xaae8f345.mm.p670x38b72420.o oVar) {
        super(0);
        this.f365732d = i17;
        this.f365733e = activityC16846x5788f028;
        this.f365734f = oVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f365732d;
        o13.p.d(i17);
        if (i17 > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028 = this.f365733e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.p2.Bi(activityC16846x5788f028.getIntent(), 44, 1, ((yq3.v) this.f365734f).h());
            android.content.Intent intent = new android.content.Intent(activityC16846x5788f028, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16839xcb4450c0.class);
            intent.putExtra("Select_Talker_Name", activityC16846x5788f028.f235229e);
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f0282 = this.f365733e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC16846x5788f0282, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ContactMoreInfoUIWxContact$initCommonChatroom$1$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC16846x5788f0282.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC16846x5788f0282, "com/tencent/mm/plugin/profile/ui/ContactMoreInfoUIWxContact$initCommonChatroom$1$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return jz5.f0.f384359a;
    }
}
