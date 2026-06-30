package t24;

/* loaded from: classes.dex */
public final class r extends a24.g {
    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        android.view.ViewGroup viewGroup;
        c24.f item = (c24.f) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p(holder, item, i17, i18, z17, list);
        a24.i iVar = item.f119610e;
        if (iVar instanceof s24.f) {
            if (!((s24.f) iVar).z7() && (viewGroup = (android.view.ViewGroup) holder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f568214m43)) != null) {
                int i19 = 0;
                while (true) {
                    if (!(i19 < viewGroup.getChildCount())) {
                        break;
                    }
                    int i27 = i19 + 1;
                    android.view.View childAt = viewGroup.getChildAt(i19);
                    if (childAt == null) {
                        throw new java.lang.IndexOutOfBoundsException();
                    }
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting_new/type/converts/SettingJumpConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/setting/ui/setting_new/model/SettingMvvmListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(childAt, "com/tencent/mm/plugin/setting/ui/setting_new/type/converts/SettingJumpConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/setting/ui/setting_new/model/SettingMvvmListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    i19 = i27;
                }
            }
            android.widget.TextView textView = (android.widget.TextView) holder.p(android.R.id.title);
            if (textView != null) {
                textView.setText(iVar.c7());
            }
            q(holder, iVar.W6(), com.p314xaae8f345.mm.R.id.f565583cu2, t24.j.f496856d);
            q(holder, iVar.getF243411p(), android.R.id.summary, t24.k.f496857d);
            if (iVar.getF243412q() != null) {
                q(holder, iVar.getF243412q(), android.R.id.summary, t24.l.f496858d);
            }
            q(holder, iVar.getF243413r(), com.p314xaae8f345.mm.R.id.rrl, t24.m.f496859d);
            q(holder, java.lang.Integer.valueOf(iVar.getF243414s()), com.p314xaae8f345.mm.R.id.rrl, t24.n.f496860d);
            s24.f fVar = (s24.f) iVar;
            java.lang.Integer f243429t = fVar.getF243429t();
            q(holder, f243429t != null ? fVar.m80379x76847179().getDrawable(f243429t.intValue()) : null, com.p314xaae8f345.mm.R.id.o4r, t24.o.f496861d);
            java.lang.Integer f243427r = fVar.getF243427r();
            q(holder, f243427r != null ? fVar.m80379x76847179().getString(f243427r.intValue()) : null, com.p314xaae8f345.mm.R.id.o58, t24.p.f496862d);
            java.lang.Integer f243428s = fVar.getF243428s();
            q(holder, f243428s != null ? fVar.m80379x76847179().getResources().getDrawable(f243428s.intValue()) : null, com.p314xaae8f345.mm.R.id.o58, t24.q.f496863d);
            q(holder, null, com.p314xaae8f345.mm.R.id.o5_, t24.e.f496851d);
            java.lang.Integer y76 = fVar.y7();
            q(holder, y76 != null ? fVar.m80379x76847179().getDrawable(y76.intValue()) : null, com.p314xaae8f345.mm.R.id.h9o, t24.f.f496852d);
            q(holder, iVar.getF243411p(), com.p314xaae8f345.mm.R.id.o57, t24.g.f496853d);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fVar.C7(), "")) {
                return;
            }
            q(holder, fVar.C7(), com.p314xaae8f345.mm.R.id.h9o, new t24.h(iVar));
            q(holder, holder.f374654e.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bfj), com.p314xaae8f345.mm.R.id.oct, t24.i.f496855d);
        }
    }

    @Override // a24.g
    public java.lang.Integer n(in5.s0 holder, a24.i baseItem, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseItem, "baseItem");
        if (baseItem instanceof s24.f) {
            s24.f fVar = (s24.f) baseItem;
            if (!fVar.z7()) {
                return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570826ek5);
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fVar.C7(), "")) {
                return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30864xbddafb2a.bzs);
            }
            java.lang.Integer f243429t = fVar.getF243429t();
            if ((f243429t != null ? fVar.m80379x76847179().getDrawable(f243429t.intValue()) : null) == null && baseItem.W6() == null) {
                java.lang.Integer f243427r = fVar.getF243427r();
                if ((f243427r != null ? fVar.m80379x76847179().getString(f243427r.intValue()) : null) == null && baseItem.getF243413r() == null) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(baseItem.c7(), "")) {
                        return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30864xbddafb2a.c0r);
                    }
                }
            }
            return java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30864xbddafb2a.bzh);
        }
        return null;
    }
}
