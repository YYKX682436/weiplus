package com.qq.taf.jce.p308x7ea5603f;

/* renamed from: com.qq.taf.jce.dynamic.DynamicOutputStream */
/* loaded from: classes13.dex */
public final class C2868xd08de5a0 extends com.qq.taf.jce.C2860x6de9642d {
    public C2868xd08de5a0(java.nio.ByteBuffer byteBuffer) {
        super(byteBuffer);
    }

    /* renamed from: write */
    public void m21428x6c257df(com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e c2871x2c850a2e) {
        int m21442xb5887064 = c2871x2c850a2e.m21442xb5887064();
        int i17 = 0;
        if (c2871x2c850a2e instanceof com.qq.taf.jce.p308x7ea5603f.C2879x6be1bb12) {
            m21338x6c257df(0, m21442xb5887064);
            return;
        }
        if (c2871x2c850a2e instanceof com.qq.taf.jce.p308x7ea5603f.C2870x24211a6b) {
            m21338x6c257df(((com.qq.taf.jce.p308x7ea5603f.C2870x24211a6b) c2871x2c850a2e).get(), m21442xb5887064);
            return;
        }
        if (c2871x2c850a2e instanceof com.qq.taf.jce.p308x7ea5603f.C2876xd2c375fe) {
            m21352x6c257df(((com.qq.taf.jce.p308x7ea5603f.C2876xd2c375fe) c2871x2c850a2e).get(), m21442xb5887064);
            return;
        }
        if (c2871x2c850a2e instanceof com.qq.taf.jce.p308x7ea5603f.C2865xfbcad4b2) {
            m21335x6c257df(((com.qq.taf.jce.p308x7ea5603f.C2865xfbcad4b2) c2871x2c850a2e).get(), m21442xb5887064);
            return;
        }
        if (c2871x2c850a2e instanceof com.qq.taf.jce.p308x7ea5603f.C2877x7fe5b49) {
            m21349x6c257df(((com.qq.taf.jce.p308x7ea5603f.C2877x7fe5b49) c2871x2c850a2e).get(), m21442xb5887064);
            return;
        }
        if (c2871x2c850a2e instanceof com.qq.taf.jce.p308x7ea5603f.C2864x5efd2d69) {
            m21354x6c257df(((com.qq.taf.jce.p308x7ea5603f.C2864x5efd2d69) c2871x2c850a2e).get(), m21442xb5887064);
            return;
        }
        if (c2871x2c850a2e instanceof com.qq.taf.jce.p308x7ea5603f.C2872x2d16d2dc) {
            com.qq.taf.jce.p308x7ea5603f.C2872x2d16d2dc c2872x2d16d2dc = (com.qq.taf.jce.p308x7ea5603f.C2872x2d16d2dc) c2871x2c850a2e;
            m21332x41640cbc(8);
            m21363xac27925f((byte) 9, m21442xb5887064);
            m21338x6c257df(c2872x2d16d2dc.m21443x35e001(), 0);
            com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e[] c2871x2c850a2eArr = c2872x2d16d2dc.get();
            int length = c2871x2c850a2eArr.length;
            while (i17 < length) {
                m21428x6c257df(c2871x2c850a2eArr[i17]);
                i17++;
            }
            return;
        }
        if (c2871x2c850a2e instanceof com.qq.taf.jce.p308x7ea5603f.C2874xd21691e) {
            com.qq.taf.jce.p308x7ea5603f.C2874xd21691e c2874xd21691e = (com.qq.taf.jce.p308x7ea5603f.C2874xd21691e) c2871x2c850a2e;
            m21332x41640cbc(8);
            m21363xac27925f((byte) 8, m21442xb5887064);
            int m21450x35e001 = c2874xd21691e.m21450x35e001();
            m21338x6c257df(m21450x35e001, 0);
            while (i17 < m21450x35e001) {
                m21428x6c257df(c2874xd21691e.m21444xb5884f29(i17));
                m21428x6c257df(c2874xd21691e.m21446x754a37bb(i17));
                i17++;
            }
            return;
        }
        if (!(c2871x2c850a2e instanceof com.qq.taf.jce.p308x7ea5603f.C2878xb6d6ea05)) {
            if (c2871x2c850a2e instanceof com.qq.taf.jce.p308x7ea5603f.C2873x7dafb7be) {
                m21339x6c257df(((com.qq.taf.jce.p308x7ea5603f.C2873x7dafb7be) c2871x2c850a2e).get(), m21442xb5887064);
                return;
            } else if (c2871x2c850a2e instanceof com.qq.taf.jce.p308x7ea5603f.C2869x38d0841e) {
                m21337x6c257df(((com.qq.taf.jce.p308x7ea5603f.C2869x38d0841e) c2871x2c850a2e).get(), m21442xb5887064);
                return;
            } else {
                if (!(c2871x2c850a2e instanceof com.qq.taf.jce.p308x7ea5603f.C2866x1979789)) {
                    throw new com.qq.taf.jce.C2856xe9f52235("unknow JceField type: ".concat(c2871x2c850a2e.getClass().getName()));
                }
                m21336x6c257df(((com.qq.taf.jce.p308x7ea5603f.C2866x1979789) c2871x2c850a2e).get(), m21442xb5887064);
                return;
            }
        }
        m21332x41640cbc(2);
        m21363xac27925f((byte) 10, m21442xb5887064);
        com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e[] c2871x2c850a2eArr2 = ((com.qq.taf.jce.p308x7ea5603f.C2878xb6d6ea05) c2871x2c850a2e).get();
        for (com.qq.taf.jce.p308x7ea5603f.C2871x2c850a2e c2871x2c850a2e2 : c2871x2c850a2eArr2) {
            m21428x6c257df(c2871x2c850a2e2);
        }
        m21332x41640cbc(2);
        m21363xac27925f((byte) 11, 0);
    }

    public C2868xd08de5a0(int i17) {
        super(i17);
    }

    public C2868xd08de5a0() {
    }
}
