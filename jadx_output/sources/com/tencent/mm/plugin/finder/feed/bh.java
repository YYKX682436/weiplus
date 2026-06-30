package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes3.dex */
public final class bh implements db2.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f106385a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f106386b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f106387c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f106388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f106389e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f106390f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f106391g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f106392h;

    public bh(com.tencent.mm.ui.widget.dialog.u3 u3Var, boolean z17, com.tencent.mm.ui.MMActivity mMActivity, java.lang.String str, java.lang.String str2, zy2.i5 i5Var, zy2.i5 i5Var2, java.lang.String str3) {
        this.f106385a = u3Var;
        this.f106386b = z17;
        this.f106387c = mMActivity;
        this.f106388d = str;
        this.f106389e = str2;
        this.f106390f = i5Var;
        this.f106391g = i5Var2;
        this.f106392h = str3;
    }

    public static final void b(com.tencent.mm.ui.MMActivity mMActivity, r45.v71 v71Var, zy2.i5 i5Var, java.lang.String str) {
        com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(mMActivity);
        androidx.appcompat.app.AppCompatActivity context = mMActivity.getContext();
        java.lang.Object[] objArr = new java.lang.Object[1];
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        androidx.appcompat.app.AppCompatActivity context2 = mMActivity.getContext();
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) v71Var.getCustom(3);
        java.lang.String nickname = finderContact != null ? finderContact.getNickname() : null;
        ((ke0.e) xVar).getClass();
        objArr[0] = com.tencent.mm.pluginsdk.ui.span.c0.i(context2, nickname);
        u1Var.g(context.getString(com.tencent.mm.R.string.eb8, objArr));
        u1Var.b(new com.tencent.mm.plugin.finder.feed.ah(v71Var, i5Var, str, mMActivity));
        u1Var.q(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01f6, code lost:
    
        if ((r12.length() > 0) == true) goto L113;
     */
    @Override // db2.z0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r50, int r51, java.lang.String r52, r45.v71 r53) {
        /*
            Method dump skipped, instructions count: 797
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.feed.bh.a(int, int, java.lang.String, r45.v71):void");
    }
}
