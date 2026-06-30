package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class pj extends com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.pk implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.it {
    public static final int K = 0;
    public static final int L = 1;
    public static final int M = 2;
    public static final int O = 1;
    public static final int P = 2;
    public static final int Q = 3;
    public static final int R = 4;
    public int N;
    protected float S = 1.0f;
    protected float T = 1.0f;
    protected float U = 1.0f;
    protected float V = 0.0f;
    protected float W = 0.0f;
    protected float X = 0.0f;

    /* renamed from: a, reason: collision with root package name */
    private com.tencent.mapsdk.internal.pj.a f132163a;

    /* renamed from: b, reason: collision with root package name */
    private com.tencent.mapsdk.internal.pj.b f132164b;

    /* loaded from: classes6.dex */
    public interface a {
        boolean b();

        java.lang.String c();

        android.graphics.Bitmap d();
    }

    /* loaded from: classes6.dex */
    public interface b {
        void a();
    }

    public final synchronized void a(com.tencent.mapsdk.internal.pj.a aVar) {
        this.f132163a = aVar;
    }

    public void b(int i17) {
        this.N = i17;
        this.S = 1.0f;
        this.T = 1.0f;
        this.U = 1.0f;
        this.V = 0.0f;
        this.W = 0.0f;
    }

    private int a() {
        return this.N;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.it
    public final void a(int i17, java.lang.Object obj) {
        if (i17 == 1) {
            this.S = ((java.lang.Number) obj).floatValue();
            return;
        }
        if (i17 == 2) {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu) obj;
            this.T = (float) fuVar.f131000a;
            this.U = (float) fuVar.f131001b;
        } else if (i17 != 3) {
            if (i17 != 4) {
                return;
            }
            this.X = ((java.lang.Number) obj).floatValue();
        } else {
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu fuVar2 = (com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.fu) obj;
            this.V = (float) fuVar2.f131000a;
            this.W = (float) fuVar2.f131001b;
        }
    }
}
