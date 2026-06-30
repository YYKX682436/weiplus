package ab1;

@j95.b
/* loaded from: classes.dex */
public final class l extends i95.w implements ab1.f {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f2731d = jz5.h.b(ab1.g.f2716d);

    public void Ai(android.content.Context context, com.tencent.mm.plugin.appbrand.jsapi.address.AddressSelectorContract$SelectRequest request, yz5.l onSelect, yz5.a onCancel) {
        java.lang.String g07;
        boolean z17;
        java.util.ArrayList arrayList;
        java.lang.Object obj;
        java.lang.String str;
        boolean b17;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(request, "request");
        kotlin.jvm.internal.o.g(onSelect, "onSelect");
        kotlin.jvm.internal.o.g(onCancel, "onCancel");
        if (!kotlin.jvm.internal.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper())) {
            ((ku5.t0) ku5.t0.f312615d).B(new ab1.i(this, context, request, onSelect, onCancel));
            return;
        }
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        java.util.ArrayList arrayList2 = request.f78706e;
        if (arrayList2 == null || arrayList2.isEmpty()) {
            g07 = "北京市";
        } else {
            ab1.c cVar = request.f78705d;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(cVar.f2715d);
            java.util.ArrayList arrayList4 = request.f78706e;
            kotlin.jvm.internal.o.d(arrayList4);
            int i17 = cVar.f2715d;
            int i18 = 0;
            com.tencent.mm.plugin.address.model.RcptItem rcptItem = null;
            while (i18 < i17) {
                java.lang.String str2 = (java.lang.String) kz5.n0.a0(arrayList4, i18);
                q71.f0 wi6 = wi();
                java.lang.String str3 = rcptItem != null ? rcptItem.f74372e : null;
                if (str3 == null) {
                    str3 = "";
                }
                java.util.List e17 = wi6.e(str3);
                if (str2 == null || str2.length() == 0) {
                    break;
                }
                int i19 = 0;
                while (true) {
                    if (i19 >= str2.length()) {
                        z17 = true;
                        break;
                    } else {
                        if (!java.lang.Character.isDigit(str2.charAt(i19))) {
                            z17 = false;
                            break;
                        }
                        i19++;
                    }
                }
                if (z17) {
                    java.util.Iterator it = ((java.util.ArrayList) e17).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            arrayList = arrayList4;
                            obj = null;
                            break;
                        }
                        java.lang.Object next = it.next();
                        com.tencent.mm.plugin.address.model.RcptItem rcptItem2 = (com.tencent.mm.plugin.address.model.RcptItem) next;
                        kotlin.jvm.internal.o.d(rcptItem2);
                        java.lang.String str4 = rcptItem2.f74372e;
                        java.util.Iterator it6 = it;
                        if (str4.length() < str2.length()) {
                            arrayList = arrayList4;
                            b17 = false;
                        } else {
                            if (str4.length() > str2.length()) {
                                arrayList = arrayList4;
                                int i27 = 0;
                                str = str2;
                                for (int length = str4.length() - str2.length(); i27 < length; length = length) {
                                    str = str + '0';
                                    i27++;
                                }
                            } else {
                                arrayList = arrayList4;
                                str = str2;
                            }
                            b17 = kotlin.jvm.internal.o.b(str4, str);
                        }
                        if (b17) {
                            obj = next;
                            break;
                        } else {
                            it = it6;
                            arrayList4 = arrayList;
                        }
                    }
                    com.tencent.mm.plugin.address.model.RcptItem rcptItem3 = (com.tencent.mm.plugin.address.model.RcptItem) obj;
                    if (rcptItem3 == null) {
                        break;
                    }
                    rcptItem = rcptItem3;
                    i18++;
                    arrayList4 = arrayList;
                } else {
                    arrayList = arrayList4;
                    com.tencent.mm.plugin.address.model.RcptItem b18 = wi().b(e17, str2);
                    if (b18 == null) {
                        break;
                    }
                    rcptItem = b18;
                    i18++;
                    arrayList4 = arrayList;
                }
            }
            if (rcptItem == null) {
                g07 = "北京市 北京市 东城区";
            } else {
                do {
                    arrayList3.add(0, rcptItem);
                    rcptItem = wi().c(rcptItem.f74375h);
                } while (rcptItem != null);
                while (arrayList3.size() < java.lang.Math.max(cVar.f2715d, 3)) {
                    com.tencent.mm.plugin.address.model.RcptItem rcptItem4 = (com.tencent.mm.plugin.address.model.RcptItem) kz5.n0.Z(wi().e(((com.tencent.mm.plugin.address.model.RcptItem) kz5.n0.i0(arrayList3)).f74372e));
                    if (rcptItem4 == null) {
                        break;
                    } else {
                        arrayList3.add(arrayList3.size(), rcptItem4);
                    }
                }
                g07 = kz5.n0.g0(arrayList3, " ", null, null, 0, null, ab1.h.f2717d, 30, null);
            }
        }
        com.tencent.mm.plugin.address.ui.l1 l1Var = new com.tencent.mm.plugin.address.ui.l1(context, g07, new ab1.j(c0Var, onSelect, this, request, h0Var), request.f78705d.f2715d, wi(), request.f78707f, null);
        h0Var.f310123d = l1Var;
        l1Var.f281406o = new ab1.k(c0Var, onCancel, h0Var);
        l1Var.show();
    }

    public final q71.f0 wi() {
        return (q71.f0) ((jz5.n) this.f2731d).getValue();
    }
}
