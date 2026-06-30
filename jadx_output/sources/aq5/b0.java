package aq5;

/* loaded from: classes5.dex */
public final class b0 extends com.tencent.matrix.lifecycle.h {
    @Override // com.tencent.matrix.lifecycle.h
    public void onEnterForeground() {
    }

    @Override // com.tencent.matrix.lifecycle.h
    public void onExitForeground() {
        aq5.f fVar = aq5.p0.f13274b;
        aq5.a aVar = fVar != null ? fVar.f13233c : null;
        int i17 = aVar == null ? -1 : aq5.a0.f13219a[aVar.ordinal()];
        if (i17 == 1) {
            cq5.i.f221543a.c(cq5.e.f221521e);
        } else {
            if (i17 != 2) {
                return;
            }
            cq5.i.f221543a.c(cq5.e.f221522f);
        }
    }
}
