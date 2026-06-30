package bm2;

/* loaded from: classes3.dex */
public final class m3 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f22095d;

    /* renamed from: e, reason: collision with root package name */
    public final bm2.h3 f22096e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f22097f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f22098g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f22099h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f22100i;

    public m3(android.content.Context context, bm2.h3 fastCommentScene) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(fastCommentScene, "fastCommentScene");
        this.f22095d = context;
        this.f22096e = fastCommentScene;
        this.f22097f = new java.util.ArrayList();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f22097f.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        bm2.i3 holder = (bm2.i3) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        java.lang.Object obj = this.f22097f.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        bm2.j3 j3Var = (bm2.j3) obj;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = holder.f21969d;
        android.widget.TextView textView = holder.f21970e;
        if (j3Var.f22006b == 2) {
            textView.setText(j3Var.f22005a);
            textView.setTextColor(this.f22095d.getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_8));
            weImageView.setVisibility(8);
            return;
        }
        bm2.h3 fastCommentScene = this.f22096e;
        kotlin.jvm.internal.o.g(fastCommentScene, "fastCommentScene");
        int ordinal = fastCommentScene.ordinal();
        if (ordinal == 0) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).ak(1, 10, j3Var.b());
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((ml2.r0) c17).ak(1, j3Var.f22006b == 0 ? 7 : 8, null);
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.I8((zy2.zb) c18, ml2.u1.M, j3Var.a(i17), null, null, null, null, false, 124, null);
        } else if (ordinal == 1) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Ak(1, j3Var.c());
        }
        bm2.k3 k3Var2 = new bm2.k3(j3Var, i17, this);
        android.widget.FrameLayout frameLayout = holder.f21971f;
        frameLayout.setOnClickListener(k3Var2);
        frameLayout.setOnTouchListener(new bm2.l3(holder));
        textView.setText(j3Var.f22005a);
        textView.setTextColor(android.graphics.Color.parseColor("#BDD9FF"));
        weImageView.setVisibility(0);
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.asz, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new bm2.i3(inflate);
    }

    public final void x(java.lang.String str) {
        int i17;
        java.util.ArrayList arrayList = this.f22097f;
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i17 = -1;
                break;
            } else {
                if (((bm2.j3) listIterator.previous()).f22006b == 0) {
                    i17 = listIterator.nextIndex();
                    break;
                }
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        jz5.f0 f0Var = null;
        if (!(valueOf.intValue() >= 0)) {
            valueOf = null;
        }
        if (valueOf == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveFastCommentAdapter", "no poi item");
            return;
        }
        int intValue = valueOf.intValue();
        this.f22099h = str;
        java.lang.String str2 = this.f22100i;
        if (!(true ^ (str2 == null || str2.length() == 0))) {
            str2 = null;
        }
        if (str2 != null) {
            if (str == null) {
                java.lang.String str3 = ((bm2.j3) arrayList.get(intValue)).f22005a;
                java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491500da0, str2);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                if (!kotlin.jvm.internal.o.b(str3, r26.n0.u0(string).toString())) {
                    bm2.j3 j3Var = (bm2.j3) arrayList.get(intValue);
                    java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491500da0, str2);
                    kotlin.jvm.internal.o.f(string2, "getString(...)");
                    java.lang.String obj = r26.n0.u0(string2).toString();
                    j3Var.getClass();
                    kotlin.jvm.internal.o.g(obj, "<set-?>");
                    j3Var.f22005a = obj;
                    notifyItemChanged(intValue);
                }
            } else {
                java.lang.String t17 = r26.i0.t(str, "<%@>", str2, false);
                if (!kotlin.jvm.internal.o.b(((bm2.j3) arrayList.get(intValue)).f22005a, t17)) {
                    bm2.j3 j3Var2 = (bm2.j3) arrayList.get(intValue);
                    j3Var2.getClass();
                    j3Var2.f22005a = t17;
                    notifyItemChanged(intValue);
                }
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            bm2.j3 j3Var3 = (bm2.j3) arrayList.get(intValue);
            java.lang.String string3 = this.f22095d.getResources().getString(com.tencent.mm.R.string.deu);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            j3Var3.getClass();
            j3Var3.f22005a = string3;
        }
    }

    public final void y(r45.ze2 ze2Var) {
        int i17;
        jz5.f0 f0Var;
        java.lang.String string;
        jz5.f0 f0Var2;
        java.util.ArrayList arrayList = this.f22097f;
        java.util.ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i17 = -1;
                break;
            } else {
                if (((bm2.j3) listIterator.previous()).f22006b == 0) {
                    i17 = listIterator.nextIndex();
                    break;
                }
            }
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        if (!(valueOf.intValue() >= 0)) {
            valueOf = null;
        }
        if (valueOf == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveFastCommentAdapter", "no poi item");
            return;
        }
        int intValue = valueOf.intValue();
        if (ze2Var == null || (string = ze2Var.getString(2)) == null) {
            f0Var = null;
        } else {
            this.f22100i = string;
            java.lang.String str = this.f22099h;
            if (!(true ^ (str == null || str.length() == 0))) {
                str = null;
            }
            f0Var = jz5.f0.f302826a;
            if (str != null) {
                java.lang.String t17 = r26.i0.t(str, "<%@>", string, false);
                if (!kotlin.jvm.internal.o.b(((bm2.j3) arrayList.get(intValue)).f22005a, t17)) {
                    bm2.j3 j3Var = (bm2.j3) arrayList.get(intValue);
                    j3Var.getClass();
                    j3Var.f22005a = t17;
                    notifyItemChanged(intValue);
                }
                f0Var2 = f0Var;
            } else {
                f0Var2 = null;
            }
            if (f0Var2 == null) {
                java.lang.String str2 = ((bm2.j3) arrayList.get(intValue)).f22005a;
                java.lang.String string2 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491500da0, string);
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                if (!kotlin.jvm.internal.o.b(str2, r26.n0.u0(string2).toString())) {
                    bm2.j3 j3Var2 = (bm2.j3) arrayList.get(intValue);
                    java.lang.String string3 = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.f491500da0, string);
                    kotlin.jvm.internal.o.f(string3, "getString(...)");
                    java.lang.String obj = r26.n0.u0(string3).toString();
                    j3Var2.getClass();
                    kotlin.jvm.internal.o.g(obj, "<set-?>");
                    j3Var2.f22005a = obj;
                    notifyItemChanged(intValue);
                }
            }
        }
        if (f0Var == null) {
            this.f22100i = null;
        }
    }

    public final void z(java.util.ArrayList itemList, java.lang.String str) {
        bm2.j3 j3Var;
        java.lang.Object obj;
        java.lang.Object obj2;
        kotlin.jvm.internal.o.g(itemList, "itemList");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = this.f22097f;
        arrayList.addAll(arrayList2);
        if (str == null || str.length() == 0) {
            j3Var = null;
        } else {
            kotlin.jvm.internal.o.d(str);
            j3Var = new bm2.j3(str, 2, 0L, 0, null, 20, null);
        }
        java.util.Iterator it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((bm2.j3) obj).f22006b == 0) {
                    break;
                }
            }
        }
        bm2.j3 j3Var2 = (bm2.j3) obj;
        arrayList2.clear();
        if (j3Var != null) {
            arrayList2.add(j3Var);
        }
        java.util.Iterator it6 = itemList.iterator();
        while (it6.hasNext()) {
            ol2.c cVar = (ol2.c) it6.next();
            java.lang.String str2 = cVar.f346145a;
            java.lang.Integer num = cVar.f346146b;
            if (str2 != null && num != null) {
                int intValue = num.intValue();
                java.util.Iterator it7 = arrayList.iterator();
                while (true) {
                    if (!it7.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it7.next();
                    bm2.j3 j3Var3 = (bm2.j3) obj2;
                    if (j3Var3.f22006b == 1 && kotlin.jvm.internal.o.b(j3Var3.f22005a, str2) && j3Var3.f22008d == intValue) {
                        break;
                    }
                }
                bm2.j3 j3Var4 = (bm2.j3) obj2;
                arrayList2.add(new bm2.j3(str2, 1, j3Var4 != null ? j3Var4.f22007c : 0L, intValue, cVar.f346147c));
            }
        }
        if (j3Var2 != null) {
            arrayList2.add(j3Var2);
        }
        notifyDataSetChanged();
    }
}
