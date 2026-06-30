package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class s1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s1 f206874d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.s1();

    public s1() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        try {
            for (java.util.Map.Entry entry : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.v1.f206930e.entrySet()) {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r1) entry.getValue()).f206824a && !((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r1) entry.getValue()).f206826b) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.r1) entry.getValue()).f206839h0 = 1;
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLoadingTimeReporter", "notifyAppBackground: ", th6);
        }
        return jz5.f0.f384359a;
    }
}
