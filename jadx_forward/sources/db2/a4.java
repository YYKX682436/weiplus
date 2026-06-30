package db2;

/* loaded from: classes2.dex */
public final class a4 extends az2.j {

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f309423t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(java.lang.String wxUsername, int i17, java.lang.String posterFinderusername, int i18, java.lang.String str, r45.gz0 gz0Var) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxUsername, "wxUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(posterFinderusername, "posterFinderusername");
        this.f309423t = "Finder.CgiFinderUserPagePreview";
        r45.v13 v13Var = new r45.v13();
        v13Var.set(1, db2.t4.f309704a.b(6611, this.f97668n));
        v13Var.set(2, wxUsername);
        v13Var.set(3, java.lang.Integer.valueOf(i17));
        v13Var.set(6, posterFinderusername);
        v13Var.set(5, java.lang.Integer.valueOf(i18));
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        v13Var.set(4, xy2.c.e(context));
        v13Var.set(7, str);
        v13Var.set(8, gz0Var);
        B(v13Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderUserPagePreview", "init wxUsername " + wxUsername + "， " + posterFinderusername + ", scene: " + i18);
    }

    @Override // az2.j
    public void A(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.w13 resp = (r45.w13) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f309423t, "[onCgiBack] errType=" + i17 + " errCode=" + i18 + " errMsg=" + str + " thread=" + java.lang.Thread.currentThread() + ' ');
    }

    public final void B(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = fVar;
        r45.w13 w13Var = new r45.w13();
        w13Var.set(0, new r45.ie());
        r45.ie ieVar = (r45.ie) w13Var.m75936x14adae67(0);
        if (ieVar != null) {
            ieVar.f458493e = new r45.du5();
        }
        lVar.f152198b = w13Var;
        lVar.f152199c = "/cgi-bin/micromsg-bin/finderuserpagepreview";
        lVar.f152200d = 6611;
        p(lVar.a());
    }

    @Override // az2.j, cz2.j
    public cz2.f v() {
        return cz2.f.f306537f;
    }

    public /* synthetic */ a4(java.lang.String str, int i17, java.lang.String str2, int i18, java.lang.String str3, r45.gz0 gz0Var, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, i17, str2, (i19 & 8) != 0 ? 0 : i18, (i19 & 16) != 0 ? null : str3, (i19 & 32) != 0 ? null : gz0Var);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(java.lang.String username, int i17) {
        super(null, null, 3, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f309423t = "Finder.CgiFinderUserPagePreview";
        r45.v13 v13Var = new r45.v13();
        v13Var.set(1, db2.t4.f309704a.b(6611, this.f97668n));
        v13Var.set(5, java.lang.Integer.valueOf(i17));
        v13Var.set(4, username);
        B(v13Var);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CgiFinderUserPagePreview", "scene: " + i17);
    }
}
