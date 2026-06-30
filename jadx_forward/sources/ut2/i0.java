package ut2;

/* loaded from: classes3.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.k0 f512449d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ut2.k0 k0Var) {
        super(0);
        this.f512449d = k0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f512449d.f512491b.findViewById(com.p314xaae8f345.mm.R.id.p3l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewGroup);
        viewGroup.post(new d92.b(new d92.c(viewGroup, false)));
        return viewGroup;
    }
}
