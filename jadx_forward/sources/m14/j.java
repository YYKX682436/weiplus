package m14;

/* loaded from: classes11.dex */
public class j implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m14.f f404411d;

    public j(m14.f fVar) {
        this.f404411d = fVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingChattingResetHelper", "Clean all messages confirmed.");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(14553, 5, 2, "");
        g0Var.mo68477x336bdfd8(324L, 0L, 1L, false);
        m14.f fVar = this.f404411d;
        fVar.f404404c = false;
        fVar.f404405d = new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab();
        android.content.Context context = fVar.f404402a;
        fVar.f404403b = db5.e1.Q(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), fVar.f404402a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new m14.g(this));
        java.util.ArrayList Ai = ((ng0.o) ((og0.n) i95.n0.c(og0.n.class))).Ai();
        if (Ai == null || Ai.size() <= 0) {
            ((ku5.t0) ku5.t0.f394148d).b(new m14.RunnableC29118x2ee9bb(fVar), "doResetChatHistory");
        } else {
            fVar.f404403b.dismiss();
            android.content.Context context2 = fVar.f404402a;
            db5.e1.L(context2, false, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kkb, java.lang.Integer.valueOf(Ai.size())), null, fVar.f404402a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fs8), fVar.f404402a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b98), new m14.h(this, Ai), new m14.i(this), -1, com.p314xaae8f345.mm.R.C30859x5a72f63.f560155ch);
        }
    }
}
