package ni2;

/* loaded from: classes10.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ni2.k0 f418861d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f418862e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ni2.k0 k0Var, android.content.Context context) {
        super(2);
        this.f418861d = k0Var;
        this.f418862e = context;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        android.widget.TextView textView;
        km2.q qVar;
        km2.q qVar2;
        xh2.i iVar;
        xh2.i iVar2;
        xh2.i iVar3;
        int intValue = ((java.lang.Number) obj).intValue();
        ij2.c item = (ij2.c) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        ni2.k0 k0Var = this.f418861d;
        java.lang.Object obj3 = item;
        for (java.util.Map.Entry entry : k0Var.f418885m.entrySet()) {
            if (((java.lang.Number) entry.getKey()).intValue() != intValue) {
                if (((ij2.c) entry.getValue()).f373226c == ij2.b.f373222e) {
                    obj3 = entry.getValue();
                } else {
                    ((ij2.c) entry.getValue()).b(false);
                }
            }
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj3, item);
        java.util.HashMap hashMap = k0Var.f418886n;
        if (!b17) {
            ij2.c cVar = (ij2.c) obj3;
            xh2.a aVar = cVar.f373229f;
            int i17 = (aVar == null || (iVar3 = aVar.f536054b) == null) ? 0 : iVar3.f536086e;
            if (aVar != null) {
                xh2.a aVar2 = item.f373229f;
                hashMap.put(java.lang.Integer.valueOf((aVar2 == null || (iVar2 = aVar2.f536054b) == null) ? 0 : iVar2.f536086e), aVar);
                xh2.i iVar4 = aVar.f536054b;
                xh2.a aVar3 = item.f373229f;
                iVar4.f536086e = (aVar3 == null || (iVar = aVar3.f536054b) == null) ? 0 : iVar.f536086e;
            }
            xh2.a aVar4 = item.f373229f;
            if (aVar4 != null) {
                hashMap.put(java.lang.Integer.valueOf(i17), aVar4);
                aVar4.f536054b.f536086e = i17;
            }
            xh2.a aVar5 = item.f373229f;
            item.a(cVar.f373229f);
            cVar.a(aVar5);
            item.b(false);
            cVar.b(false);
        }
        java.lang.String str = "";
        if (item.f373226c == ij2.b.f373222e) {
            xh2.a aVar6 = item.f373229f;
            if (((aVar6 == null || (qVar2 = aVar6.f536053a) == null) ? "" : zl2.r4.D0(zl2.r4.f555483a, qVar2.f390705c, qVar2.f390706d, false, 4, null)).length() > 0) {
                android.content.Context context = this.f418862e;
                android.content.res.Resources resources = context.getResources();
                xh2.a aVar7 = item.f373229f;
                if (aVar7 != null && (qVar = aVar7.f536053a) != null) {
                    str = zl2.r4.D0(zl2.r4.f555483a, qVar.f390705c, qVar.f390706d, false, 4, null);
                }
                java.lang.String string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m0y, str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                java.lang.String string2 = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m0z);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                k0Var.x(string, string2);
            } else {
                k0Var.x("", "");
            }
        } else {
            k0Var.x("", "");
        }
        java.util.Set entrySet = k0Var.f418887o.entrySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
        java.util.Iterator it = entrySet.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            java.util.Map.Entry entry2 = (java.util.Map.Entry) it.next();
            xh2.a aVar8 = (xh2.a) hashMap.get(entry2.getKey());
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar8 != null ? aVar8.b() : null, ((xh2.a) entry2.getValue()).b())) {
                z17 = true;
                break;
            }
        }
        android.view.View view = k0Var.f199916f;
        if (z17) {
            textView = view instanceof android.widget.TextView ? (android.widget.TextView) view : null;
            if (textView != null) {
                textView.setEnabled(true);
                textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaz));
            }
        } else {
            textView = view instanceof android.widget.TextView ? (android.widget.TextView) view : null;
            if (textView != null) {
                textView.setEnabled(false);
                textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29));
            }
        }
        return jz5.f0.f384359a;
    }
}
