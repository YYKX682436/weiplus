package za3;

/* loaded from: classes15.dex */
public class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2642x2e06d1.C21500x7be515c9 f552435a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f552436b;

    /* renamed from: c, reason: collision with root package name */
    public za3.a0 f552437c;

    /* renamed from: d, reason: collision with root package name */
    public int f552438d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f552439e = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    public za3.d0 f552440f = null;

    public e0(android.content.Context context, android.view.View view, java.lang.String str) {
        this.f552436b = context;
        this.f552435a = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21500x7be515c9) view;
        java.util.LinkedList<java.lang.String> b17 = va3.j0.Ui().b(str);
        b17.size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.String str2 : b17) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                arrayList.add(new za3.c0(this, str2));
                arrayList2.add(str2);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            za3.c0 c0Var = (za3.c0) it.next();
            if (c0Var.f552429b) {
                c0Var.b();
            }
        }
        this.f552438d = i65.a.b(this.f552436b, 60);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21500x7be515c9 c21500x7be515c9 = this.f552435a;
        c21500x7be515c9.m79011x15066afe(true);
        c21500x7be515c9.m79010xdbabe831(this.f552438d);
        c21500x7be515c9.m79008x3ea112a6(true);
        c21500x7be515c9.setOnItemClickListener(new za3.y(this));
        za3.a0 a0Var = new za3.a0(this, arrayList);
        this.f552437c = a0Var;
        c21500x7be515c9.setAdapter((android.widget.ListAdapter) a0Var);
        b(arrayList2);
        c21500x7be515c9.invalidate();
        this.f552437c.notifyDataSetChanged();
    }

    public void a(java.lang.String str) {
        if (this.f552437c.c(str)) {
            this.f552437c.a(str).b();
            this.f552437c.notifyDataSetChanged();
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21500x7be515c9 c21500x7be515c9 = this.f552435a;
            c21500x7be515c9.invalidate();
            if (c21500x7be515c9.m79007x8e1f5b83() || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                return;
            }
            za3.a0 a0Var = this.f552437c;
            int i17 = 0;
            while (true) {
                java.util.ArrayList arrayList = a0Var.f552421d;
                if (i17 >= arrayList.size()) {
                    i17 = -1;
                    break;
                } else if (((za3.c0) arrayList.get(i17)).f552428a.equals(str)) {
                    break;
                } else {
                    i17++;
                }
            }
            if (i17 != -1) {
                int i18 = this.f552438d * i17;
                int m79006x9746038c = c21500x7be515c9.m79006x9746038c();
                if (i18 >= m79006x9746038c) {
                    int i19 = this.f552438d * 3;
                    m79006x9746038c = i18 > m79006x9746038c + i19 ? i18 - i19 : 0;
                }
                this.f552439e.mo50293x3498a0(new za3.z(this, i17 != 0 ? m79006x9746038c : 0));
            }
        }
    }

    public void b(java.util.ArrayList arrayList) {
        java.util.ArrayList arrayList2;
        arrayList.size();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        za3.a0 a0Var = this.f552437c;
        a0Var.getClass();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.Iterator it = a0Var.f552421d.iterator();
        while (it.hasNext()) {
            arrayList5.add(((za3.c0) it.next()).f552428a);
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            java.lang.String str = (java.lang.String) it6.next();
            if (arrayList5.indexOf(str) == -1) {
                arrayList3.add(str);
            }
        }
        java.util.Iterator it7 = arrayList5.iterator();
        while (it7.hasNext()) {
            java.lang.String str2 = (java.lang.String) it7.next();
            if (arrayList.indexOf(str2) == -1) {
                arrayList4.add(str2);
            }
        }
        arrayList3.size();
        arrayList4.size();
        int size = arrayList3.size();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21500x7be515c9 c21500x7be515c9 = this.f552435a;
        if (size > 0) {
            java.util.Iterator it8 = arrayList3.iterator();
            while (it8.hasNext()) {
                java.lang.String str3 = (java.lang.String) it8.next();
                if (!this.f552437c.c(str3)) {
                    za3.c0 c0Var = new za3.c0(this, str3);
                    za3.a0 a0Var2 = this.f552437c;
                    a0Var2.f552421d.add(c0Var);
                    a0Var2.notifyDataSetChanged();
                    c21500x7be515c9.invalidate();
                }
            }
        }
        if (arrayList4.size() > 0) {
            java.util.Iterator it9 = arrayList4.iterator();
            while (it9.hasNext()) {
                java.lang.String str4 = (java.lang.String) it9.next();
                if (this.f552437c.c(str4)) {
                    za3.a0 a0Var3 = this.f552437c;
                    int i17 = 0;
                    while (true) {
                        arrayList2 = a0Var3.f552421d;
                        if (i17 >= arrayList2.size()) {
                            i17 = -1;
                            break;
                        } else if (((za3.c0) arrayList2.get(i17)).f552428a.equals(str4)) {
                            break;
                        } else {
                            i17++;
                        }
                    }
                    if (i17 != -1) {
                        arrayList2.remove(i17);
                        a0Var3.notifyDataSetChanged();
                    }
                    c21500x7be515c9.invalidate();
                }
            }
        }
    }

    public void c() {
        za3.a0 a0Var = this.f552437c;
        java.util.Iterator it = a0Var.f552421d.iterator();
        while (it.hasNext()) {
            ((za3.c0) it.next()).a();
        }
        a0Var.notifyDataSetChanged();
        this.f552435a.invalidate();
    }
}
