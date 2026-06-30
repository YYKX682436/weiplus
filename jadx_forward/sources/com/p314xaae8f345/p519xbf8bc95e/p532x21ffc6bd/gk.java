package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class gk {

    /* renamed from: a, reason: collision with root package name */
    private java.util.ArrayList<com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gj> f131124a = new java.util.ArrayList<>();

    private com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gj a(int i17) {
        return this.f131124a.get(i17);
    }

    private int b() {
        return this.f131124a.size();
    }

    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gj gjVar) {
        this.f131124a.add(gjVar);
    }

    private void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.gk gkVar) {
        this.f131124a.addAll(gkVar.f131124a);
    }

    public final float[] a() {
        float[] fArr = new float[this.f131124a.size() * 3];
        for (int i17 = 0; i17 < this.f131124a.size(); i17++) {
            int i18 = i17 * 3;
            fArr[i18 + 0] = this.f131124a.get(i17).f131120a;
            fArr[i18 + 1] = this.f131124a.get(i17).f131121b;
            fArr[i18 + 2] = this.f131124a.get(i17).f131122c;
        }
        return fArr;
    }
}
