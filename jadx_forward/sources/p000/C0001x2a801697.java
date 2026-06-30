package p000;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LChattingTingCategoryMvvmView;", "Lcom/tencent/mm/mvvm/MvvmView;", "Lz01/e0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "def", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: ChattingTingCategoryMvvmView */
/* loaded from: classes9.dex */
public final class C0001x2a801697 extends com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905<z01.e0> {

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f81570f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0001x2a801697(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public android.view.View c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int i17 = q31.r.f441452c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 u17 = ((bf5.a) ((q31.t) ((q31.r) c17)).Bi()).u(context);
        this.f81570f = u17;
        return u17;
    }

    @Override // com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905
    public void e(q31.p pVar, q31.p pVar2) {
        z01.e0 e0Var = (z01.e0) pVar2;
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f81570f;
        if (abstractC11172x705e5905 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("holder");
            throw null;
        }
        if (e0Var != null) {
            c11.e eVar = new c11.e();
            java.lang.String str = e0Var.f550533e;
            if (str == null) {
                str = "";
            }
            eVar.f119361d = str;
            java.lang.String str2 = e0Var.f550534f;
            eVar.f119362e = str2 != null ? str2 : "";
            eVar.f119363f = e0Var.f550535g;
            android.view.View.OnClickListener onClickListener = e0Var.f550536h;
            if (onClickListener != null) {
                setOnClickListener(onClickListener);
            }
            c11.c cVar = new c11.c(null, null, null, 7, null);
            eVar.f119365h = cVar;
            android.view.View view = e0Var.f550532d;
            if (view != null) {
                cVar.f119356c = kz5.n0.S0(kz5.c0.k(view));
            }
            eVar.f119366i = p000.h.f359297d;
            abstractC11172x705e5905.m48330xfcfee142(eVar);
        }
    }

    public /* synthetic */ C0001x2a801697(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0001x2a801697(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
