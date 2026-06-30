package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33;

/* loaded from: classes10.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16539x811795fe f230591d;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16539x811795fe c16539x811795fe) {
        this.f230591d = c16539x811795fe;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16539x811795fe c16539x811795fe = this.f230591d;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16534x56a8ffb4 c16534x56a8ffb4 = c16539x811795fe.f230431q;
            if (c16534x56a8ffb4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("innerSeekBar");
                throw null;
            }
            c16534x56a8ffb4.m66939x853690dc(-1.0f);
            java.util.ArrayList a18 = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16539x811795fe.a(c16539x811795fe, c16539x811795fe.f230422e, c16539x811795fe.f230434t);
            c16539x811795fe.f230429o = a18;
            c16539x811795fe.f230427m = new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.f0(c16539x811795fe, a18);
            if (c16539x811795fe.f230422e >= c16539x811795fe.f230432r) {
                a17 = c16539x811795fe.getWidth() - (c16539x811795fe.f230428n * 2);
            } else {
                double d17 = 0.0d;
                while (c16539x811795fe.f230429o.iterator().hasNext()) {
                    d17 += ((com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.e0) r3.next()).f230542b / c16539x811795fe.f230434t;
                }
                a17 = a06.d.a(d17 * c16539x811795fe.f230424g);
            }
            float width = ((((float) c16539x811795fe.f230433s) * 1.0f) / ((float) c16539x811795fe.f230432r)) * (c16539x811795fe.getWidth() - (c16539x811795fe.f230428n * 2));
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16534x56a8ffb4 c16534x56a8ffb42 = c16539x811795fe.f230431q;
            if (c16534x56a8ffb42 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("innerSeekBar");
                throw null;
            }
            int b17 = a06.d.b(width);
            int i17 = c16539x811795fe.f230428n;
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16534x56a8ffb4 c16534x56a8ffb43 = c16539x811795fe.f230431q;
            if (c16534x56a8ffb43 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("innerSeekBar");
                throw null;
            }
            c16534x56a8ffb42.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.i1(c16534x56a8ffb42, a17, i17 - c16534x56a8ffb43.f230481p, b17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.f0 f0Var = c16539x811795fe.f230427m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f0Var);
            f0Var.f230548g = (c16539x811795fe.getWidth() - c16539x811795fe.f230428n) - a17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.f0 f0Var2 = c16539x811795fe.f230427m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f0Var2);
            f0Var2.f230547f = c16539x811795fe.f230428n;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = c16539x811795fe.f230430p;
            if (c1163xf1deaba4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            c1163xf1deaba4.mo7960x6cab2c8d(c16539x811795fe.f230427m);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RecyclerThumbSeekBar", "notifySuccess durationMs:" + c16539x811795fe.f230422e + ", intervalMs:" + c16539x811795fe.f230434t + " itemCount:" + c16539x811795fe.f230429o.size() + " horizontalPadding:" + c16539x811795fe.f230428n + " seekBarDurationMs:[" + c16539x811795fe.f230433s + ", " + c16539x811795fe.f230432r + "] seekBarDurationPx:[" + width + ", " + a17 + "] thumbView:[" + c16539x811795fe.f230424g + ", " + c16539x811795fe.f230423f + "] logicMax:" + (c16539x811795fe.getWidth() - (c16539x811795fe.f230428n * 2)) + " view:[" + c16539x811795fe.getWidth() + ", " + c16539x811795fe.getHeight() + ']');
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.g gVar = c16539x811795fe.f230425h;
            if (gVar != null) {
                gVar.a(false);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RecyclerThumbSeekBar", "RecyclerThumbSeekBar notifySuccess error : %s", e17.getMessage());
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.g gVar2 = c16539x811795fe.f230425h;
            if (gVar2 != null) {
                gVar2.a(true);
            }
        }
    }
}
