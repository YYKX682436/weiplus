package an2;

/* loaded from: classes14.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ an2.i f90387d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(an2.i iVar) {
        super(1);
        this.f90387d = iVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        an2.b item = (an2.b) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        an2.i iVar = this.f90387d;
        iVar.a(item);
        yz5.l lVar = iVar.f90390c;
        if (lVar != null) {
            lVar.mo146xb9724478(item);
        }
        return jz5.f0.f384359a;
    }
}
