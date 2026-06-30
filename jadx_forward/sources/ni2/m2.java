package ni2;

/* loaded from: classes10.dex */
public final class m2 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.p2 f418919d;

    public m2(ni2.p2 p2Var) {
        this.f418919d = p2Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        km2.q qVar;
        java.lang.String str;
        java.util.LinkedList<xh2.a> linkedList;
        xh2.a aVar;
        java.util.HashMap hashMap;
        km2.q qVar2;
        java.lang.String str2;
        int itemId = menuItem.getItemId();
        fj2.s sVar = fj2.s.f344716a;
        ni2.p2 p2Var = this.f418919d;
        if (itemId == 1) {
            ml2.w4 w4Var = ml2.w4.f409724i;
            xh2.a aVar2 = p2Var.f418951d;
            fj2.s.h(sVar, w4Var, (aVar2 == null || (qVar = aVar2.f536053a) == null || (str = qVar.f390705c) == null) ? "" : str, 0, 0, 12, null);
            ((ni2.f1) ((jz5.n) p2Var.f418954g).mo141623x754a37bb()).B(p2Var.f418951d, p2Var.f418952e);
            return;
        }
        if (itemId != 2) {
            return;
        }
        ml2.w4 w4Var2 = ml2.w4.f409728p;
        xh2.a aVar3 = p2Var.f418951d;
        fj2.s.h(sVar, w4Var2, (aVar3 == null || (qVar2 = aVar3.f536053a) == null || (str2 = qVar2.f390705c) == null) ? "" : str2, 0, 0, 12, null);
        xh2.c cVar = (xh2.c) ((mm2.o4) p2Var.f418949b.a(mm2.o4.class)).A.mo3195x754a37bb();
        if (cVar == null || (linkedList = cVar.f536064a) == null || (aVar = p2Var.f418951d) == null) {
            return;
        }
        ni2.k0 k0Var = (ni2.k0) ((jz5.n) p2Var.f418955h).mo141623x754a37bb();
        k0Var.getClass();
        k0Var.w();
        java.util.HashMap hashMap2 = k0Var.f418886n;
        hashMap2.clear();
        k0Var.f418888p = aVar.a();
        for (xh2.a aVar4 : linkedList) {
            hashMap2.put(java.lang.Integer.valueOf(aVar4.f536054b.f536086e), aVar4);
        }
        java.util.HashMap hashMap3 = k0Var.f418887o;
        hashMap3.clear();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList2.add(((xh2.a) it.next()).a());
        }
        java.util.Iterator it6 = linkedList2.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            hashMap = k0Var.f418885m;
            if (!hasNext) {
                break;
            }
            xh2.a aVar5 = (xh2.a) it6.next();
            hashMap3.put(java.lang.Integer.valueOf(aVar5.f536054b.f536086e), aVar5);
            ij2.c cVar2 = (ij2.c) hashMap.get(java.lang.Integer.valueOf(aVar5.f536054b.f536086e));
            if (cVar2 != null) {
                cVar2.a(aVar5);
            }
        }
        ij2.c cVar3 = (ij2.c) hashMap.get(java.lang.Integer.valueOf(aVar.f536054b.f536086e));
        if (cVar3 != null) {
            cVar3.b(true);
            ((ni2.i0) k0Var.f418890r).mo149xb9724478(java.lang.Integer.valueOf(aVar.f536054b.f536086e), cVar3);
        }
    }
}
