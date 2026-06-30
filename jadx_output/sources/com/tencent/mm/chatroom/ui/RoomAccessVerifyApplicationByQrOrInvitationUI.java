package com.tencent.mm.chatroom.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/tencent/mm/chatroom/ui/RoomAccessVerifyApplicationByQrOrInvitationUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "Lcom/tencent/mm/modelbase/u0;", "<init>", "()V", "com/tencent/mm/chatroom/ui/x5", "com/tencent/mm/chatroom/ui/t6", "com/tencent/mm/chatroom/ui/u6", "ui-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class RoomAccessVerifyApplicationByQrOrInvitationUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity implements com.tencent.mm.modelbase.u0 {

    /* renamed from: i, reason: collision with root package name */
    public static final com.tencent.mm.chatroom.ui.u6 f63828i = new com.tencent.mm.chatroom.ui.u6(null);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f63829d = jz5.h.b(new com.tencent.mm.chatroom.ui.w6(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f63830e = jz5.h.b(new com.tencent.mm.chatroom.ui.v6(this));

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f63831f = jz5.h.b(new com.tencent.mm.chatroom.ui.y6(this));

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f63832g = jz5.h.b(new com.tencent.mm.chatroom.ui.x6(this));

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f63833h = jz5.h.b(new com.tencent.mm.chatroom.ui.d7(this));

    public final java.lang.String U6() {
        return (java.lang.String) ((jz5.n) this.f63829d).getValue();
    }

    public final android.text.SpannableString V6(java.lang.String str, in.c cVar, android.content.Context context, android.widget.TextView textView) {
        java.lang.String str2;
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String str3 = cVar.f292721d;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str3 == null) {
            str3 = "";
        }
        com.tencent.mm.storage.z3 n17 = Bi.n(str3, true);
        if (n17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ApplicationByQrOrInvitationUI", "ct == null");
            return null;
        }
        java.lang.String w07 = !com.tencent.mm.sdk.platformtools.t8.K0(n17.w0()) ? n17.w0() : ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().W0(str).z0(cVar.f292721d);
        if (com.tencent.mm.sdk.platformtools.t8.K0(w07)) {
            w07 = n17.w0();
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(w07)) {
            w07 = n17.f2();
        }
        java.lang.String str4 = w07 + W6(cVar.f292725h, cVar.f292726i);
        if (textView == null) {
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            str2 = str4 != null ? str4 : "";
            ((ke0.e) xVar).getClass();
            return com.tencent.mm.pluginsdk.ui.span.c0.i(context, str2);
        }
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        str2 = str4 != null ? str4 : "";
        float textSize = textView.getTextSize();
        ((ke0.e) xVar2).getClass();
        return com.tencent.mm.pluginsdk.ui.span.c0.j(context, str2, textSize);
    }

    public final java.lang.String W6(java.lang.String str, java.lang.String str2) {
        boolean z17 = true;
        if (!(str == null || str.length() == 0)) {
            if (str2 != null && str2.length() != 0) {
                z17 = false;
            }
            if (!z17) {
                dm.w8 w8Var = new dm.w8();
                w8Var.field_appid = str;
                w8Var.field_wordingId = str2;
                w8Var.field_language = com.tencent.mm.sdk.platformtools.m2.f(com.tencent.mm.sdk.platformtools.x2.f193071a);
                ((u41.l) ((za0.k) ((ab0.b0) i95.n0.c(ab0.b0.class))).Ai()).y0(w8Var, new java.lang.String[]{"appid", "wordingId", com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_LANGUAGE});
                if (w8Var.field_wording != null) {
                    java.lang.String str3 = "＠" + w8Var.field_wording;
                    if (str3 != null) {
                        return str3;
                    }
                }
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(str2);
                com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
                ab0.b0 b0Var = (ab0.b0) i95.n0.c(ab0.b0.class);
                java.lang.String str4 = w8Var.field_language;
                ((za0.k) b0Var).getClass();
                r1Var.g(new l41.z(str, str4, linkedList, 0));
            }
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x009d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X6() {
        /*
            r6 = this;
            r0 = 2131301838(0x7f0915ce, float:1.8221745E38)
            android.view.View r0 = r6.findViewById(r0)
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            androidx.recyclerview.widget.LinearLayoutManager r1 = new androidx.recyclerview.widget.LinearLayoutManager
            androidx.appcompat.app.AppCompatActivity r2 = r6.getContext()
            r1.<init>(r2)
            r0.setLayoutManager(r1)
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r2 = "intent_chatroom_username"
            java.lang.String r1 = r1.getStringExtra(r2)
            if (r1 == 0) goto L8d
            p75.n0 r2 = dm.w9.f240866o
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.util.LinkedList r3 = new java.util.LinkedList
            r3.<init>()
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            p75.d r5 = dm.w9.f240868q
            p75.m0 r1 = r5.j(r1)
            p75.d r5 = dm.w9.f240872u
            p75.s r5 = r5.u()
            r3.add(r5)
            p75.n0 r5 = dm.w9.f240866o
            p75.i0 r2 = r5.g(r2)
            r2.f352657d = r1
            r2.f352659f = r3
            r2.f352660g = r4
            p75.l0 r1 = r2.a()
            gm0.b0 r2 = gm0.j1.u()
            l75.k0 r2 = r2.f273153f
            java.lang.Class<dm.w9> r3 = dm.w9.class
            java.util.List r1 = r1.k(r2, r3)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "application count:"
            r2.<init>(r3)
            r3 = r1
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            int r4 = r3.size()
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.lang.String r4 = "MicroMsg.ApplicationByQrOrInvitationUI"
            com.tencent.mars.xlog.Log.i(r4, r2)
            int r2 = r3.size()
            if (r2 <= 0) goto L8d
            com.tencent.mm.chatroom.ui.x5 r2 = new com.tencent.mm.chatroom.ui.x5
            jz5.g r3 = r6.f63833h
            jz5.n r3 = (jz5.n) r3
            java.lang.Object r3 = r3.getValue()
            com.tencent.mm.sdk.coroutines.LifecycleScope r3 = (com.tencent.mm.sdk.coroutines.LifecycleScope) r3
            r2.<init>(r6, r0, r1, r3)
            goto L8e
        L8d:
            r2 = 0
        L8e:
            r0.setAdapter(r2)
            androidx.recyclerview.widget.f2 r1 = r0.getAdapter()
            r2 = 8
            r3 = 2131303633(0x7f091cd1, float:1.8225386E38)
            r4 = 0
            if (r1 != 0) goto Lc0
            r0.setVisibility(r2)
            android.view.View r0 = r6.findViewById(r3)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setVisibility(r4)
            r0 = 2131303678(0x7f091cfe, float:1.8225477E38)
            android.view.View r0 = r6.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            if (r0 != 0) goto Lb5
            goto Ld5
        Lb5:
            r1 = 2131781527(0x7f106797, float:1.919467E38)
            java.lang.String r1 = r6.getString(r1)
            r0.setText(r1)
            goto Ld5
        Lc0:
            r0.setVisibility(r4)
            android.view.View r1 = r6.findViewById(r3)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            r1.setVisibility(r2)
            androidx.recyclerview.widget.f2 r0 = r0.getAdapter()
            if (r0 == 0) goto Ld5
            r0.notifyDataSetChanged()
        Ld5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.chatroom.ui.RoomAccessVerifyApplicationByQrOrInvitationUI.X6():void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488397s7;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.p6d);
        setBackBtn(new com.tencent.mm.chatroom.ui.z6(this));
        dm.w9.G.observe(this, new com.tencent.mm.chatroom.ui.b7(this));
        X6();
        gm0.j1.n().f273288b.q(453, this);
        g95.u.l(U6(), 7);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(this);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.SeeAccessVerifyInfoUI);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        jz5.l[] lVarArr = new jz5.l[4];
        lVarArr[0] = new jz5.l("base_chatroom_invite_manage_source", java.lang.Integer.valueOf(getIntent().getBooleanExtra("intent_from_chattingui", false) ? 2 : 1));
        lVarArr[1] = new jz5.l("base_chatroom_user_role", java.lang.Integer.valueOf(((java.lang.Boolean) ((jz5.n) this.f63831f).getValue()).booleanValue() ? 1 : ((java.lang.Boolean) ((jz5.n) this.f63832g).getValue()).booleanValue() ? 2 : 3));
        lVarArr[2] = new jz5.l("room_username", U6());
        lVarArr[3] = new jz5.l("room_unread_count", java.lang.Integer.valueOf(((nn.j) ((nn.i) i95.n0.c(nn.i.class))).Ui(U6(), 0L)));
        ((cy1.a) rVar).gk(this, kz5.c1.k(lVarArr));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 4, 25772);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        java.lang.String U6 = U6();
        if (U6 != null) {
            p75.n0 n0Var = dm.w9.f240866o;
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put("read", (java.lang.Integer) 1);
            p75.m0 j17 = dm.w9.f240868q.j(U6);
            p75.h1 j18 = dm.w9.f240866o.j(contentValues);
            j18.b(j17);
            j18.a().f(gm0.j1.u().f273153f);
            ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().doNotify(U6);
        }
        gm0.j1.n().f273288b.q(453, this);
        super.onDestroy();
    }

    @Override // com.tencent.mm.hellhoundlib.activities.HellActivity, com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            pm0.v.X(new com.tencent.mm.chatroom.ui.c7(this));
        }
    }
}
