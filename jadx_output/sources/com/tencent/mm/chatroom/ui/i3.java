package com.tencent.mm.chatroom.ui;

/* loaded from: classes5.dex */
public final class i3 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f64219d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.storage.a3 f64220e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.chatroom.ui.j3 f64221f;

    public i3(java.util.ArrayList memberList, com.tencent.mm.storage.a3 a3Var, com.tencent.mm.chatroom.ui.j3 j3Var) {
        kotlin.jvm.internal.o.g(memberList, "memberList");
        this.f64219d = memberList;
        this.f64220e = a3Var;
        this.f64221f = j3Var;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f64219d.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.CharSequence] */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r9, int r10) {
        /*
            r8 = this;
            com.tencent.mm.chatroom.ui.m3 r9 = (com.tencent.mm.chatroom.ui.m3) r9
            java.lang.String r0 = "viewHolder"
            kotlin.jvm.internal.o.g(r9, r0)
            java.util.ArrayList r0 = r8.f64219d
            java.lang.Object r10 = r0.get(r10)
            java.lang.String r0 = "get(...)"
            kotlin.jvm.internal.o.f(r10, r0)
            com.tencent.mm.storage.z3 r10 = (com.tencent.mm.storage.z3) r10
            java.lang.String r0 = r10.d1()
            com.tencent.mm.storage.a3 r1 = r9.f64355e
            r2 = 0
            android.widget.TextView r3 = r9.f64358h
            if (r3 != 0) goto L21
            goto L46
        L21:
            java.lang.Class<vg3.x3> r4 = vg3.x3.class
            lm0.a r4 = gm0.j1.s(r4)
            vg3.x3 r4 = (vg3.x3) r4
            com.tencent.mm.plugin.messenger.foundation.h2 r4 = (com.tencent.mm.plugin.messenger.foundation.h2) r4
            com.tencent.mm.storage.k4 r4 = r4.Bi()
            boolean r5 = com.tencent.mm.sdk.platformtools.t8.f192989a
            java.lang.String r5 = ""
            if (r0 != 0) goto L37
            r6 = r5
            goto L38
        L37:
            r6 = r0
        L38:
            r7 = 1
            com.tencent.mm.storage.z3 r4 = r4.n(r6, r7)
            if (r4 != 0) goto L48
            java.lang.String r0 = "MicroMsg.RoomFollowMemberAdapter"
            java.lang.String r4 = "ct == null"
            com.tencent.mars.xlog.Log.w(r0, r4)
        L46:
            r0 = r2
            goto L9f
        L48:
            java.lang.String r6 = r4.w0()
            boolean r6 = com.tencent.mm.sdk.platformtools.t8.K0(r6)
            if (r6 != 0) goto L57
            java.lang.String r0 = r4.w0()
            goto L5f
        L57:
            if (r1 == 0) goto L5e
            java.lang.String r0 = r1.z0(r0)
            goto L5f
        L5e:
            r0 = r2
        L5f:
            boolean r6 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r6 == 0) goto L69
            java.lang.String r0 = r4.w0()
        L69:
            boolean r6 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r6 == 0) goto L73
            java.lang.String r0 = r4.f2()
        L73:
            java.lang.Class<ab0.z> r6 = ab0.z.class
            i95.m r6 = i95.n0.c(r6)
            ab0.z r6 = (ab0.z) r6
            za0.k r6 = (za0.k) r6
            r6.getClass()
            java.lang.CharSequence r0 = t41.c.a(r4, r0)
            java.lang.Class<le0.x> r4 = le0.x.class
            i95.m r4 = i95.n0.c(r4)
            le0.x r4 = (le0.x) r4
            if (r0 != 0) goto L8f
            goto L90
        L8f:
            r5 = r0
        L90:
            float r0 = r3.getTextSize()
            ke0.e r4 = (ke0.e) r4
            r4.getClass()
            android.content.Context r4 = r9.f64354d
            android.text.SpannableString r0 = com.tencent.mm.pluginsdk.ui.span.c0.j(r4, r5, r0)
        L9f:
            r3.setText(r0)
            java.lang.Class<kv.z> r0 = kv.z.class
            i95.m r0 = i95.n0.c(r0)
            kv.z r0 = (kv.z) r0
            java.lang.String r3 = r10.d1()
            com.tencent.mm.feature.avatar.w r0 = (com.tencent.mm.feature.avatar.w) r0
            android.widget.ImageView r4 = r9.f64357g
            r0.Ai(r4, r3, r2)
            android.widget.TextView r0 = r9.f64359i
            if (r0 == 0) goto Le0
            android.text.TextPaint r3 = r0.getPaint()
            com.tencent.mm.ui.bk.s0(r3)
            java.lang.String r3 = c01.z1.r()
            if (r1 == 0) goto Lc8
            java.lang.String r2 = r1.field_roomowner
        Lc8:
            boolean r1 = r3.equals(r2)
            if (r1 == 0) goto Ld3
            r1 = 0
            r0.setVisibility(r1)
            goto Ld8
        Ld3:
            r1 = 8
            r0.setVisibility(r1)
        Ld8:
            com.tencent.mm.chatroom.ui.k3 r1 = new com.tencent.mm.chatroom.ui.k3
            r1.<init>(r9, r10)
            r0.setOnClickListener(r1)
        Le0:
            if (r4 == 0) goto Lea
            com.tencent.mm.chatroom.ui.l3 r0 = new com.tencent.mm.chatroom.ui.l3
            r0.<init>(r9, r10)
            r4.setOnClickListener(r0)
        Lea:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.chatroom.ui.i3.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        kotlin.jvm.internal.o.g(viewGroup, "viewGroup");
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        android.view.View inflate = com.tencent.mm.ui.id.b(viewGroup.getContext()).inflate(com.tencent.mm.R.layout.f488400h7, viewGroup, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new com.tencent.mm.chatroom.ui.m3(context, this.f64220e, inflate, this.f64221f);
    }
}
