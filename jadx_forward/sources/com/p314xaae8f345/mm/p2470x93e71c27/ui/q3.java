package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes15.dex */
public class q3 implements z21.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722 f272624a;

    public q3(com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722 abstractC19655xeb0f7722) {
        this.f272624a = abstractC19655xeb0f7722;
    }

    @Override // z21.b
    public void a(java.lang.String[] strArr, java.util.List list) {
        for (java.lang.String str : strArr) {
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722 abstractC19655xeb0f7722 = this.f272624a;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.u3 u3Var = abstractC19655xeb0f7722.f271386d;
        if (u3Var != null) {
            u3Var.a(strArr, list);
        }
        abstractC19655xeb0f7722.f271394o.mo50303x856b99f0(0);
        abstractC19655xeb0f7722.f271394o.mo50307xb9e94560(0, abstractC19655xeb0f7722.f271391i);
    }

    @Override // z21.b
    public void b(java.util.List list) {
    }

    @Override // z21.b
    public void c() {
    }

    @Override // z21.b
    public void d(int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722 abstractC19655xeb0f7722 = this.f272624a;
        abstractC19655xeb0f7722.f271394o.mo50303x856b99f0(0);
        abstractC19655xeb0f7722.f271394o.mo50303x856b99f0(1);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.u3 u3Var = abstractC19655xeb0f7722.f271386d;
        if (u3Var != null) {
            u3Var.e();
        }
        abstractC19655xeb0f7722.h(false);
    }

    @Override // z21.b
    public void e(int i17, int i18, int i19, long j17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722 abstractC19655xeb0f7722 = this.f272624a;
        abstractC19655xeb0f7722.f271394o.mo50303x856b99f0(0);
        abstractC19655xeb0f7722.f271394o.mo50303x856b99f0(1);
        android.os.Message message = new android.os.Message();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("localCode", i17);
        bundle.putInt("errType", i18);
        bundle.putInt("errCode", i19);
        message.setData(bundle);
        message.what = 1;
        abstractC19655xeb0f7722.f271395p.mo50308x2936bf5f(message);
    }

    @Override // z21.b
    public void f(java.lang.String str, boolean z17) {
    }

    @Override // z21.b
    public void g() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19655xeb0f7722 abstractC19655xeb0f7722 = this.f272624a;
        int i17 = abstractC19655xeb0f7722.f271389g;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = abstractC19655xeb0f7722.f271396q;
        if (b4Var != null) {
            b4Var.d();
        }
        abstractC19655xeb0f7722.f271395p.mo50305x3d8a09a2(0);
    }
}
