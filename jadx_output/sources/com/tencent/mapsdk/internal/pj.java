package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class pj extends com.tencent.mapsdk.internal.pk implements com.tencent.mapsdk.internal.it {
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
    private com.tencent.mapsdk.internal.pj.a f50630a;

    /* renamed from: b, reason: collision with root package name */
    private com.tencent.mapsdk.internal.pj.b f50631b;

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
        this.f50630a = aVar;
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

    @Override // com.tencent.mapsdk.internal.it
    public final void a(int i17, java.lang.Object obj) {
        if (i17 == 1) {
            this.S = ((java.lang.Number) obj).floatValue();
            return;
        }
        if (i17 == 2) {
            com.tencent.mapsdk.internal.fu fuVar = (com.tencent.mapsdk.internal.fu) obj;
            this.T = (float) fuVar.f49467a;
            this.U = (float) fuVar.f49468b;
        } else if (i17 != 3) {
            if (i17 != 4) {
                return;
            }
            this.X = ((java.lang.Number) obj).floatValue();
        } else {
            com.tencent.mapsdk.internal.fu fuVar2 = (com.tencent.mapsdk.internal.fu) obj;
            this.V = (float) fuVar2.f49467a;
            this.W = (float) fuVar2.f49468b;
        }
    }
}
