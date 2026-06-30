package com.p314xaae8f345.mm.p669x38b6e557;

/* loaded from: classes10.dex */
public class r0 implements aw1.f0 {
    public r0(com.p314xaae8f345.mm.p669x38b6e557.q0 q0Var) {
    }

    @Override // aw1.f0
    public void a(float f17, long j17, long j18, long j19, long j27, long j28, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Shell", "compressOriginalMediaAsync, progress = " + f17 + ", compressedSize = " + j17 + ", sendCompressedSize = " + j18 + ", recvCompressedSize = " + j19 + ", sendExpectedSize = " + j27 + ", recvExpectedSize = " + j28 + ", finished = " + z17);
        if (z17) {
            aw1.l0 l0Var = aw1.l0.f96101a;
            aw1.l0.f96109i.remove(this);
        }
    }
}
