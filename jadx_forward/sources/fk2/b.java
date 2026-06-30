package fk2;

/* loaded from: classes3.dex */
public final class b extends fk2.f3 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(we2.a commentItemDependency) {
        super(commentItemDependency);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentItemDependency, "commentItemDependency");
    }

    @Override // fk2.f3, we2.o
    public void d(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17) {
        java.lang.String string;
        java.lang.String m75945x2fec8307;
        java.lang.String str;
        java.lang.String m75945x2fec83072;
        java.util.LinkedList m75941xfb821914;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        java.lang.Object D = msg.D();
        r45.jh1 jh1Var = D instanceof r45.jh1 ? (r45.jh1) D : null;
        if (jh1Var != null) {
            android.content.Context context2 = holder.f3639x46306858.getContext();
            int m75939xb282bd08 = jh1Var.m75939xb282bd08(0);
            java.lang.String str2 = "";
            if (m75939xb282bd08 == 1) {
                java.lang.Object[] objArr = new java.lang.Object[1];
                r45.f62 f62Var = (r45.f62) jh1Var.m75936x14adae67(1);
                if (f62Var != null && (m75945x2fec8307 = f62Var.m75945x2fec8307(10)) != null) {
                    str2 = m75945x2fec8307;
                }
                objArr[0] = str2;
                string = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mp8, objArr);
            } else if (m75939xb282bd08 != 2) {
                str = "";
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
                fk2.f3.s(this, msg, context2, holder, str, null, 16, null);
            } else {
                java.util.LinkedList linkedList = new java.util.LinkedList();
                r45.f62 f62Var2 = (r45.f62) jh1Var.m75936x14adae67(1);
                if (f62Var2 != null && (m75941xfb821914 = f62Var2.m75941xfb821914(5)) != null) {
                    java.util.Iterator it = m75941xfb821914.iterator();
                    while (it.hasNext()) {
                        linkedList.addAll(((r45.hd6) it.next()).m75941xfb821914(7));
                    }
                }
                java.lang.Object[] objArr2 = new java.lang.Object[2];
                r45.f62 f62Var3 = (r45.f62) jh1Var.m75936x14adae67(1);
                if (f62Var3 != null && (m75945x2fec83072 = f62Var3.m75945x2fec8307(10)) != null) {
                    str2 = m75945x2fec83072;
                }
                objArr2[0] = str2;
                zl2.r4 r4Var = zl2.r4.f555483a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
                objArr2[1] = r4Var.J0(context2, linkedList);
                string = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mpe, objArr2);
            }
            str = string;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context2);
            fk2.f3.s(this, msg, context2, holder, str, null, 16, null);
        }
        holder.f103462g.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.cu_));
    }

    @Override // we2.o
    public dk2.zf e(r45.ch1 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        return new dk2.kf(msg);
    }

    @Override // we2.o
    public int n() {
        return 20120;
    }
}
