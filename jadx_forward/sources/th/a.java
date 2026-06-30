package th;

/* loaded from: classes12.dex */
public class a implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ th.o f500765a;

    public a(th.o oVar) {
        this.f500765a = oVar;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public void mo40853xab27b508(java.lang.Object obj) {
        java.lang.StringBuilder sb6;
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k kVar;
        java.util.Iterator it;
        java.lang.Object obj2;
        rh.o2 o2Var = (rh.o2) obj;
        th.o oVar = this.f500765a;
        if (o2Var == null) {
            android.view.View view = oVar.f500800e;
            if (view != null) {
                android.widget.Toast.makeText(view.getContext(), "Skip dump: no data", 0).show();
                return;
            }
            return;
        }
        com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc c4635xec0343cc = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc) o2Var.f477019c;
        if (c4635xec0343cc.f134091d != android.os.Process.myPid()) {
            android.view.View view2 = oVar.f500800e;
            if (view2 != null) {
                android.widget.Toast.makeText(view2.getContext(), "Skip dump: only support curr process now", 0).show();
                return;
            }
            return;
        }
        qh.u uVar = new qh.u();
        uVar.i();
        uVar.a("| TOP_THREAD_DUMP\n");
        if (o2Var.b()) {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            long longValue = ((java.lang.Long) c4635xec0343cc.f134094g.f477085a).longValue();
            long j17 = o2Var.f477020d / 10;
            float k17 = sh.c.k(longValue, j17);
            linkedHashMap.put("load", java.lang.Float.valueOf(k17));
            uVar.b("Proc");
            uVar.h("pid", java.lang.String.valueOf(c4635xec0343cc.f134091d));
            uVar.h("cmm", java.lang.String.valueOf(c4635xec0343cc.f134093f));
            uVar.h("load", sh.c.m(k17, 1) + "%");
            uVar.c("Thread(" + c4635xec0343cc.f134095h.f477093a.size() + ")");
            uVar.g("  TID\tLOAD \tSTATUS \tTHREAD_NAME \tJIFFY");
            java.util.Iterator it6 = c4635xec0343cc.f134095h.f477093a.iterator();
            while (true) {
                boolean hasNext = it6.hasNext();
                sb6 = uVar.f444920a;
                if (!hasNext) {
                    break;
                }
                com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry threadJiffiesEntry = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry) it6.next();
                java.util.Iterator it7 = it6;
                long longValue2 = ((java.lang.Long) threadJiffiesEntry.f477085a).longValue();
                sb6.append((java.lang.Object) "|   -> ");
                sb6.append((java.lang.Object) sh.c.l(java.lang.String.valueOf(threadJiffiesEntry.f134098b), 5));
                sb6.append((java.lang.Object) "\t");
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                java.util.LinkedHashMap linkedHashMap2 = linkedHashMap;
                sb7.append(sh.c.m(sh.c.k(longValue2, j17), 1));
                sb7.append("%");
                sb6.append((java.lang.Object) sh.c.l(sb7.toString(), 4));
                sb6.append((java.lang.Object) "\t");
                sb6.append((java.lang.Object) (threadJiffiesEntry.f134100d ? "+" : "~"));
                sb6.append((java.lang.Object) "/");
                sb6.append((java.lang.Object) threadJiffiesEntry.f134101e);
                sb6.append((java.lang.Object) "\t");
                sb6.append((java.lang.Object) sh.c.l(threadJiffiesEntry.f134099c, 16));
                sb6.append((java.lang.Object) "\t");
                sb6.append(java.lang.Long.valueOf(longValue2));
                sb6.append((java.lang.Object) "\t");
                uVar.a("\n");
                it6 = it7;
                linkedHashMap = linkedHashMap2;
            }
            java.util.LinkedHashMap linkedHashMap3 = linkedHashMap;
            uVar.b("Stacks");
            java.util.Iterator it8 = c4635xec0343cc.f134095h.f477093a.iterator();
            while (it8.hasNext()) {
                com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry threadJiffiesEntry2 = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p558x49b0bd5a.p559xc5a27af6.C4635xec0343cc.ThreadJiffiesEntry) it8.next();
                if (sh.c.k(((java.lang.Long) threadJiffiesEntry2.f477085a).longValue(), j17) <= 0.0f) {
                    break;
                }
                uVar.c(threadJiffiesEntry2.f134099c + "(" + threadJiffiesEntry2.f134098b + ")");
                java.lang.String a17 = oVar.f500804i.a(threadJiffiesEntry2.f134098b);
                java.util.LinkedHashMap linkedHashMap4 = linkedHashMap3;
                linkedHashMap4.put("stack_" + threadJiffiesEntry2.f134099c + "(" + threadJiffiesEntry2.f134098b + ")", a17);
                java.lang.String[] split = a17.split("\n");
                int length = split.length;
                int i17 = 0;
                int i18 = 0;
                while (i17 < length) {
                    java.lang.String str = split[i17];
                    if (i18 == 0) {
                        it = it8;
                        obj2 = "|   -> ";
                    } else {
                        it = it8;
                        obj2 = "|      ";
                    }
                    sb6.append(obj2);
                    sb6.append((java.lang.Object) str);
                    uVar.a("\n");
                    i18++;
                    i17++;
                    it8 = it;
                }
                linkedHashMap3 = linkedHashMap4;
            }
            java.util.LinkedHashMap linkedHashMap5 = linkedHashMap3;
            qh.f0 f0Var = oVar.f500801f;
            if (f0Var != null && (kVar = (com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k) f0Var.i(com.p314xaae8f345.p552xbf8d97c1.p557xd1f258e5.p560x68ac49f.k.class)) != null) {
                kVar.k("MATRIX_TOP_DUMP", c4635xec0343cc.f134091d, linkedHashMap5);
            }
        } else {
            uVar.b("Invalid data, ignore");
        }
        uVar.f();
        uVar.d();
        android.view.View view3 = oVar.f500800e;
        if (view3 != null) {
            android.widget.Toast.makeText(view3.getContext(), "Dump finish, search TAG 'TOP_THREAD_DUMP' for detail", 1).show();
        }
    }
}
