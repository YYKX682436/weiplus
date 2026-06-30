package cl1;

/* loaded from: classes8.dex */
public class o extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb f124423n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb c12767x7016a6fb, android.content.Context context) {
        super(context);
        this.f124423n = c12767x7016a6fb;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public int l(int i17) {
        return super.l(h3.a.b(i17, java.lang.Math.round(this.f124423n.getContext().getResources().getDisplayMetrics().heightPixels * 0.75f), 3000));
    }
}
