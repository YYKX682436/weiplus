package hr3;

/* loaded from: classes11.dex */
public class kb implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.nb f365254d;

    public kb(hr3.nb nbVar) {
        this.f365254d = nbVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        hr3.nb nbVar = this.f365254d;
        nbVar.o();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Intro_Switch", true).addFlags(67108864);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.u(intent, nbVar.f365365g.f279303d);
    }
}
