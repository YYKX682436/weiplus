package fp4;

/* loaded from: classes5.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp4.s f346905d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(fp4.s sVar) {
        super(0);
        this.f346905d = sVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fp4.s sVar = this.f346905d;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(sVar.f346907f.getContext());
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103 c17043x8103c103 = sVar.f346907f;
        android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d48, (android.view.ViewGroup) c17043x8103c103, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17043x8103c103.k(c17043x8103c103, inflate, null, 2, null);
        inflate.setOnClickListener(fp4.p.f346904d);
        return (android.view.ViewGroup) inflate;
    }
}
