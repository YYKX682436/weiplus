package androidx.compose.foundation.lazy.layout;

/* loaded from: classes14.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final n0.v2 f10429a = n0.s4.c(null, null, 2, null);

    public final androidx.compose.foundation.lazy.layout.t a(int i17, long j17) {
        androidx.compose.foundation.lazy.layout.u uVar = (androidx.compose.foundation.lazy.layout.u) ((n0.q4) this.f10429a).getValue();
        if (uVar == null) {
            return androidx.compose.foundation.lazy.layout.b.f10390a;
        }
        androidx.compose.foundation.lazy.layout.x xVar = (androidx.compose.foundation.lazy.layout.x) uVar;
        androidx.compose.foundation.lazy.layout.w wVar = new androidx.compose.foundation.lazy.layout.w(i17, j17, null);
        xVar.f10439h.b(wVar);
        if (xVar.f10442n) {
            return wVar;
        }
        xVar.f10442n = true;
        xVar.f10438g.post(xVar);
        return wVar;
    }
}
