package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public class s extends com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.v f296163a;

    public s(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.v vVar) {
        this.f296163a = vVar;
    }

    @Override // com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.k1
    public void b(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4, int i17, int i18) {
        int computeHorizontalScrollOffset = c22949xf1deaba4.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = c22949xf1deaba4.computeVerticalScrollOffset();
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.v vVar = this.f296163a;
        int computeVerticalScrollRange = vVar.f296211s.computeVerticalScrollRange();
        int i19 = vVar.f296210r;
        int i27 = computeVerticalScrollRange - i19;
        int i28 = vVar.f296193a;
        vVar.f296212t = i27 > 0 && i19 >= i28;
        int computeHorizontalScrollRange = vVar.f296211s.computeHorizontalScrollRange();
        int i29 = vVar.f296209q;
        boolean z17 = computeHorizontalScrollRange - i29 > 0 && i29 >= i28;
        vVar.f296213u = z17;
        boolean z18 = vVar.f296212t;
        if (!z18 && !z17) {
            if (vVar.f296214v != 0) {
                vVar.c(0);
                return;
            }
            return;
        }
        if (z18) {
            float f17 = i19;
            vVar.f296204l = (int) ((f17 * (computeVerticalScrollOffset + (f17 / 2.0f))) / computeVerticalScrollRange);
            vVar.f296203k = java.lang.Math.min(i19, (i19 * i19) / computeVerticalScrollRange);
        }
        if (vVar.f296213u) {
            float f18 = computeHorizontalScrollOffset;
            float f19 = i29;
            vVar.f296207o = (int) ((f19 * (f18 + (f19 / 2.0f))) / computeHorizontalScrollRange);
            vVar.f296206n = java.lang.Math.min(i29, (i29 * i29) / computeHorizontalScrollRange);
        }
        int i37 = vVar.f296214v;
        if (i37 == 0 || i37 == 1) {
            vVar.c(1);
        }
    }
}
