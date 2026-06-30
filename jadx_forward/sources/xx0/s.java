package xx0;

/* loaded from: classes5.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f539467d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xx0.t f539468e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f539469f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ vt3.p f539470g;

    public s(int i17, xx0.t tVar, long j17, vt3.p pVar) {
        this.f539467d = i17;
        this.f539468e = tVar;
        this.f539469f = j17;
        this.f539470g = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        ?? r17;
        mx0.ja m47325xd23b40d7;
        mx0.ja m47325xd23b40d72;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = true;
        int i17 = this.f539467d + 1;
        int i18 = i17 + 1;
        xx0.t tVar = this.f539468e;
        int size = ((java.util.ArrayList) tVar.f539474g).size();
        if (i18 > size) {
            i18 = size;
        }
        if (i17 < i18) {
            java.util.List<vt3.p> subList = ((java.util.ArrayList) tVar.f539474g).subList(i17, i18);
            r17 = new java.util.ArrayList(kz5.d0.q(subList, 10));
            for (vt3.p pVar : subList) {
                r17.add(new jz5.l(pVar.f521553b, java.lang.Long.valueOf(pVar.f521556e)));
            }
        } else {
            r17 = kz5.p0.f395529d;
        }
        java.util.List list = r17;
        xx0.j jVar = tVar.f539472e;
        if (jVar != null) {
            long j17 = this.f539469f;
            int i19 = this.f539467d;
            mx0.x7 x7Var = (mx0.x7) jVar;
            vt3.p templateItem = this.f539470g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateItem, "templateItem");
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = x7Var.f413968a;
            m47325xd23b40d7 = c10977x8e40eced.m47325xd23b40d7();
            m47325xd23b40d7.getClass();
            java.util.ArrayList arrayList2 = m47325xd23b40d7.f413614m;
            boolean z18 = arrayList2 instanceof java.util.Collection;
            java.lang.String templateId = templateItem.f521553b;
            if (!z18 || !arrayList2.isEmpty()) {
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((vt3.p) it.next()).f521553b, templateId)) {
                        break;
                    }
                }
            }
            z17 = false;
            if (!z17) {
                arrayList2.add(0, templateItem);
                mx0.t9 t9Var = m47325xd23b40d7.f413613i;
                t9Var.getClass();
                java.util.ArrayList arrayList3 = t9Var.f413891f;
                arrayList3.clear();
                arrayList3.addAll(arrayList2);
                t9Var.m8146xced61ae5();
            }
            m47325xd23b40d72 = c10977x8e40eced.m47325xd23b40d7();
            m47325xd23b40d72.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
            java.util.Iterator it6 = m47325xd23b40d72.f413614m.iterator();
            int i27 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i27 = -1;
                    break;
                } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((vt3.p) it6.next()).f521553b, templateId)) {
                    break;
                } else {
                    i27++;
                }
            }
            m47325xd23b40d72.c(i27 >= 0 ? i27 : 0);
            x7Var.f413968a.T0(templateItem, i19, j17, list);
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/shoot_composing/template_panel/TemplateTabPageView$Adapter$onBindViewHolder$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
