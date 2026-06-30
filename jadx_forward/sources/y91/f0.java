package y91;

/* loaded from: classes7.dex */
public class f0 implements r56.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aa1.b f541802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y91.i0 f541803e;

    public f0(y91.i0 i0Var, aa1.b bVar) {
        this.f541803e = i0Var;
        this.f541802d = bVar;
    }

    @Override // r56.b
    /* renamed from: call */
    public void mo131526x2e7a5e(java.lang.Object obj) {
        x91.c cVar = (x91.c) obj;
        if (cVar == null || cVar.f534171f == null || cVar.f534172g == null) {
            return;
        }
        y91.i0 i0Var = this.f541803e;
        ((java.util.HashSet) i0Var.f541821g).remove(cVar.f534166a);
        x91.h hVar = new x91.h(cVar);
        boolean z17 = true;
        int i17 = 0;
        if (!((hVar.f534182c == null || hVar.f534183d == null) ? false : true)) {
            hVar = null;
        }
        if (hVar == null) {
            return;
        }
        java.lang.String c17 = i0Var.c(this.f541802d.a("USN"));
        if (android.text.TextUtils.isEmpty(c17)) {
            return;
        }
        hVar.f534180a.getClass();
        x91.b b17 = x91.b.b();
        if (b17.f534163a) {
            return;
        }
        java.util.HashMap hashMap = (java.util.HashMap) b17.f534164b;
        if (hashMap.containsKey(c17)) {
            x91.h hVar2 = (x91.h) hashMap.get(c17);
            if (hVar2 != null && hVar2.m175198xb2c87fbf(hVar)) {
                return;
            } else {
                z17 = false;
            }
        }
        hashMap.put(c17, hVar);
        while (true) {
            java.util.ArrayList arrayList = (java.util.ArrayList) b17.f534165c;
            if (i17 >= arrayList.size()) {
                return;
            }
            x91.a aVar = (x91.a) arrayList.get(i17);
            if (aVar != null) {
                if (z17) {
                    aVar.C2(hVar);
                } else {
                    aVar.K4(hVar);
                }
                i17++;
            } else {
                arrayList.remove(i17);
            }
        }
    }
}
