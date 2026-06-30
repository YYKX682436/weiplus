package b33;

/* loaded from: classes8.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b33.o f17676d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(b33.o oVar) {
        super(1);
        this.f17676d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.gallery.BaseMediaTabActivity baseMediaTabActivity = (com.tencent.mm.ui.gallery.BaseMediaTabActivity) obj;
        b33.o oVar = this.f17676d;
        androidx.appcompat.app.AppCompatActivity activity = oVar.getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((b33.f) pf5.z.f353948a.a(activity).a(b33.f.class)).onPageSelected(oVar.T6());
        if (baseMediaTabActivity != null) {
            baseMediaTabActivity.V6(oVar.getActivity());
        }
        return jz5.f0.f302826a;
    }
}
