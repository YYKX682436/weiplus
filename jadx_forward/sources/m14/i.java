package m14;

/* loaded from: classes11.dex */
public class i implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m14.j f404410d;

    public i(m14.j jVar) {
        this.f404410d = jVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14553, 5, 3, "");
        m14.j jVar = this.f404410d;
        jVar.f404411d.f404403b.show();
        m14.f fVar = jVar.f404411d;
        fVar.f404404c = false;
        fVar.f404405d = new com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab();
        m14.f fVar2 = jVar.f404411d;
        fVar2.getClass();
        ((ku5.t0) ku5.t0.f394148d).b(new m14.RunnableC29118x2ee9bb(fVar2), "doResetChatHistory");
    }
}
