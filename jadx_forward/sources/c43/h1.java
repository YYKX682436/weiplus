package c43;

/* loaded from: classes15.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f119966a = new java.util.ArrayList();

    public final void a(android.content.Context context, java.util.List tplBlockList, boolean z17, c43.f1 f1Var) {
        java.util.List list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tplBlockList, "tplBlockList");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(tplBlockList)) {
            return;
        }
        java.util.LinkedList<c43.b1> linkedList = new java.util.LinkedList();
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        java.util.Iterator it = tplBlockList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            list = this.f119966a;
            if (!hasNext) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15829xf6bcdd1d c15829xf6bcdd1d = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15829xf6bcdd1d) it.next();
            java.lang.String str = c15829xf6bcdd1d.f36893xf02988d6;
            if (str != null) {
                ((java.util.ArrayList) list).add(str);
            }
            int i17 = c15829xf6bcdd1d.f36892x368f3a;
            if (i17 == 0) {
                java.lang.String str2 = c15829xf6bcdd1d.f36890x38b73479;
                if (str2 != null) {
                    stringBuffer.append(str2);
                }
            } else if (i17 != 1) {
                if (i17 == 2) {
                    java.lang.String str3 = c15829xf6bcdd1d.f36893xf02988d6;
                    if (str3 != null) {
                        u33.h Bi = ((s33.d) ((u33.g) i95.n0.c(u33.g.class))).Bi(str3);
                        if (Bi != null) {
                            stringBuffer.append(((y33.e) Bi).f66960x21eb2633);
                        } else {
                            stringBuffer.append(c15829xf6bcdd1d.f36890x38b73479);
                        }
                    } else {
                        stringBuffer.append(c15829xf6bcdd1d.f36890x38b73479);
                    }
                }
            } else if (c15829xf6bcdd1d.f36890x38b73479 != null) {
                c43.b1 b1Var = new c43.b1(0, 0, null, null, false, 31, null);
                b1Var.f119928a = stringBuffer.length();
                b1Var.f119929b = stringBuffer.length() + c15829xf6bcdd1d.f36890x38b73479.length();
                b1Var.f119930c = c15829xf6bcdd1d.f36891x28d1961f;
                b1Var.f119931d = c15829xf6bcdd1d.f36893xf02988d6;
                b1Var.f119932e = c15829xf6bcdd1d.f36889x15672080;
                linkedList.add(b1Var);
                stringBuffer.append(c15829xf6bcdd1d.f36890x38b73479);
            }
        }
        if (stringBuffer.length() == 0) {
            return;
        }
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(stringBuffer);
        for (c43.b1 b1Var2 : linkedList) {
            spannableStringBuilder.setSpan(new c43.g1(b1Var2, z17, context, f1Var), b1Var2.f119928a, b1Var2.f119929b, 33);
        }
        if (f1Var != null) {
            f1Var.a(spannableStringBuilder);
        }
        ((s33.d) ((u33.g) i95.n0.c(u33.g.class))).Ai(list, null);
    }
}
