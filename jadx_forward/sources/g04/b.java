package g04;

/* loaded from: classes15.dex */
public class b implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2048x37c70a.C17351x2827be15 f348979d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2048x37c70a.C17351x2827be15 c17351x2827be15) {
        this.f348979d = c17351x2827be15;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        android.util.Pair pair = (android.util.Pair) obj;
        if (pair != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2048x37c70a.C17351x2827be15 c17351x2827be15 = this.f348979d;
            java.lang.String str = (java.lang.String) pair.first;
            g04.l lVar = (g04.l) pair.second;
            c17351x2827be15.getClass();
            if (str == null || lVar == null) {
                return;
            }
            ((ku5.t0) ku5.t0.f394148d).h(new g04.g(c17351x2827be15, str, lVar), "WordDetectThread");
        }
    }
}
