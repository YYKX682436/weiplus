package bm2;

/* loaded from: classes3.dex */
public final class v1 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f22371d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f22372e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f22373f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f22374g = new java.util.ArrayList();

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f22374g.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        bm2.p1 holder = (bm2.p1) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.lang.Object obj = this.f22374g.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        h0Var.f310123d = obj;
        int integer = ((r45.ty1) obj).getInteger(3);
        boolean z17 = true;
        android.widget.ImageView imageView = holder.f22217d;
        android.widget.TextView textView = holder.f22218e;
        if (integer != 0) {
            if (integer == 1) {
                textView.setVisibility(4);
                imageView.setImageResource(com.tencent.mm.R.drawable.f480953g8);
                holder.itemView.setOnClickListener(new bm2.t1(this));
                return;
            } else {
                if (integer != 2) {
                    return;
                }
                textView.setVisibility(4);
                imageView.setImageResource(com.tencent.mm.R.drawable.f480954g9);
                holder.itemView.setOnClickListener(new bm2.u1(this));
                return;
            }
        }
        textView.setVisibility(0);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String string = ((r45.ty1) h0Var.f310123d).getString(1);
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, string, textSize));
        java.lang.String string2 = ((r45.ty1) h0Var.f310123d).getString(4);
        if (string2 != null && string2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            imageView.setImageResource(com.tencent.mm.R.drawable.bhm);
        } else {
            mn2.g1 g1Var = mn2.g1.f329975a;
            wo0.c b17 = g1Var.l().b(new mn2.n(((r45.ty1) h0Var.f310123d).getString(4), null, 2, null), g1Var.h(mn2.f1.f329961o));
            bm2.r1 r1Var = new bm2.r1(h0Var, holder);
            b17.getClass();
            b17.f447873d = r1Var;
            b17.f();
        }
        holder.itemView.setOnClickListener(new bm2.s1(this, h0Var));
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.apd, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new bm2.p1(this, inflate);
    }

    public final java.util.List x() {
        java.util.ArrayList arrayList = this.f22374g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((r45.ty1) next).getInteger(2) != 0) {
                arrayList2.add(next);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            java.lang.String string = ((r45.ty1) it6.next()).getString(0);
            if (string == null) {
                string = "";
            }
            arrayList3.add(string);
        }
        return arrayList3;
    }

    public final void y(java.util.LinkedList linkedList) {
        java.lang.Object obj;
        java.util.ArrayList arrayList = this.f22374g;
        if (linkedList != null) {
            arrayList.clear();
            arrayList.addAll(linkedList);
        }
        java.lang.Object obj2 = null;
        if (arrayList.size() < 5) {
            java.util.Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.ty1) obj).getInteger(3) == 1) {
                        break;
                    }
                }
            }
            if (obj == null) {
                r45.ty1 ty1Var = new r45.ty1();
                ty1Var.set(3, 1);
                arrayList.add(ty1Var);
            }
        }
        if (arrayList.size() > 1) {
            java.util.Iterator it6 = arrayList.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next = it6.next();
                if (((r45.ty1) next).getInteger(3) == 2) {
                    obj2 = next;
                    break;
                }
            }
            if (obj2 == null) {
                r45.ty1 ty1Var2 = new r45.ty1();
                ty1Var2.set(3, 2);
                arrayList.add(ty1Var2);
            }
        }
        notifyDataSetChanged();
    }
}
