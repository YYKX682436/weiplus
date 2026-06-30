package os3;

/* loaded from: classes8.dex */
public class q3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os3.g4 f429712d;

    public q3(os3.g4 g4Var) {
        this.f429712d = g4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        os3.g4 g4Var = this.f429712d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e1 = g4Var.f429623d;
        viewOnCreateContextMenuListenerC16941x4db497e1.f236473v.m67784x17d4d434(viewOnCreateContextMenuListenerC16941x4db497e1.f236460f.f393159a);
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ViewOnCreateContextMenuListenerC16941x4db497e1 viewOnCreateContextMenuListenerC16941x4db497e12 = g4Var.f429623d;
        ks3.b0 b0Var = viewOnCreateContextMenuListenerC16941x4db497e12.f236460f;
        if (b0Var != null) {
            viewOnCreateContextMenuListenerC16941x4db497e12.f236469r.setText(b0Var.f393161c);
            viewOnCreateContextMenuListenerC16941x4db497e12.f236470s.setText(viewOnCreateContextMenuListenerC16941x4db497e12.f236460f.f393160b);
            viewOnCreateContextMenuListenerC16941x4db497e12.f236471t.setEnabled(true);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it = viewOnCreateContextMenuListenerC16941x4db497e12.f236460f.f393162d.iterator();
            while (it.hasNext()) {
                android.os.Bundle bundle = (android.os.Bundle) it.next();
                ks3.u uVar = new ks3.u();
                uVar.f393283e = bundle.getString(ya.b.f77485x2838ac37, "");
                uVar.f393284f = bundle.getString("item_addr", "");
                arrayList.add(uVar);
            }
            viewOnCreateContextMenuListenerC16941x4db497e12.f236464m.c(arrayList, true);
            java.util.Iterator it6 = viewOnCreateContextMenuListenerC16941x4db497e12.f236460f.f393163e.iterator();
            while (it6.hasNext()) {
                android.os.Bundle bundle2 = (android.os.Bundle) it6.next();
                ks3.u uVar2 = new ks3.u();
                uVar2.f393283e = bundle2.getString(ya.b.f77485x2838ac37, "");
                uVar2.f393284f = bundle2.getString("item_addr", "");
                arrayList2.add(uVar2);
            }
            viewOnCreateContextMenuListenerC16941x4db497e12.f236466o.c(arrayList2, true);
            java.util.Iterator it7 = viewOnCreateContextMenuListenerC16941x4db497e12.f236460f.f393164f.iterator();
            while (it7.hasNext()) {
                android.os.Bundle bundle3 = (android.os.Bundle) it7.next();
                ks3.u uVar3 = new ks3.u();
                uVar3.f393283e = bundle3.getString(ya.b.f77485x2838ac37, "");
                uVar3.f393284f = bundle3.getString("item_addr", "");
                arrayList3.add(uVar3);
            }
            if (arrayList3.isEmpty()) {
                viewOnCreateContextMenuListenerC16941x4db497e12.f236465n.setVisibility(8);
            } else {
                viewOnCreateContextMenuListenerC16941x4db497e12.f236465n.c(arrayList3, true);
            }
        }
        viewOnCreateContextMenuListenerC16941x4db497e12.f236462h.setVisibility(0);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(viewOnCreateContextMenuListenerC16941x4db497e12.f236460f.f393159a), js3.h.class, new os3.j4(viewOnCreateContextMenuListenerC16941x4db497e12));
    }
}
