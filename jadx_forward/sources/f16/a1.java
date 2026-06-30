package f16;

/* loaded from: classes15.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f340232a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f16.b1 f340233b;

    public a1(f16.b1 b1Var, java.lang.String className) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(className, "className");
        this.f340233b = b1Var;
        this.f340232a = className;
    }

    public final void a(java.lang.String name, yz5.l block) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(block, "block");
        java.util.Map map = this.f340233b.f340237a;
        f16.z0 z0Var = new f16.z0(this, name);
        block.mo146xb9724478(z0Var);
        java.lang.String internalName = z0Var.f340323d.f340232a;
        java.util.List list = z0Var.f340321b;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.ArrayList arrayList2 = (java.util.ArrayList) list;
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add((java.lang.String) ((jz5.l) it.next()).f384366d);
        }
        java.lang.String ret = (java.lang.String) z0Var.f340322c.f384366d;
        java.lang.String name2 = z0Var.f340320a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name2, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(name2);
        sb6.append('(');
        sb6.append(kz5.n0.g0(arrayList, "", null, null, 0, null, g16.z0.f349211d, 30, null));
        sb6.append(')');
        if (ret.length() > 1) {
            str = "L" + ret + ';';
        } else {
            str = ret;
        }
        sb6.append(str);
        java.lang.String jvmDescriptor = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(internalName, "internalName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jvmDescriptor, "jvmDescriptor");
        java.lang.String str2 = internalName + '.' + jvmDescriptor;
        f16.e1 e1Var = (f16.e1) z0Var.f340322c.f384367e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            arrayList3.add((f16.e1) ((jz5.l) it6.next()).f384367e);
        }
        map.put(str2, new f16.s0(e1Var, arrayList3));
    }
}
