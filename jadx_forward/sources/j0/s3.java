package j0;

/* loaded from: classes14.dex */
public final class s3 {
    public s3(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final g2.q0 a(g2.g0 textInputService, g2.e0 value, g2.e editProcessor, g2.l imeOptions, yz5.l onValueChange, yz5.l onImeActionPerformed) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textInputService, "textInputService");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editProcessor, "editProcessor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imeOptions, "imeOptions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onValueChange, "onValueChange");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onImeActionPerformed, "onImeActionPerformed");
        j0.r3 r3Var = new j0.r3(editProcessor, onValueChange);
        g2.x xVar = textInputService.f349234a;
        g2.p0 p0Var = (g2.p0) xVar;
        p0Var.getClass();
        p0Var.f349267c = true;
        p0Var.f349270f = value;
        p0Var.f349271g = imeOptions;
        p0Var.f349268d = r3Var;
        p0Var.f349269e = onImeActionPerformed;
        ((u26.o) p0Var.f349274j).e(g2.h0.StartInput);
        g2.q0 q0Var = new g2.q0(textInputService, xVar);
        textInputService.f349235b.set(q0Var);
        return q0Var;
    }
}
