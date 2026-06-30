package e60;

/* loaded from: classes10.dex */
public interface i1 {
    static void a(e60.i1 i1Var, java.lang.String input, int i17, android.graphics.Matrix matrix, android.graphics.Rect clipRect, android.graphics.Rect contentRect, android.graphics.Rect viewRect, int i18, boolean z17, yz5.p callback, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: post");
        }
        if ((i19 & 128) != 0) {
            z17 = false;
        }
        z23.h hVar = (z23.h) i1Var;
        hVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matrix, "matrix");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clipRect, "clipRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentRect, "contentRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewRect, "viewRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        z23.e eVar = z17 ? new z23.e(hVar, hVar.f551278c, i18, callback) : i17 == 1 ? new z23.e(hVar, hVar.f551276a, i18, callback) : new z23.e(hVar, hVar.f551277b, i18, callback);
        eVar.f551267i = clipRect;
        eVar.f551268m = viewRect;
        eVar.f551269n = contentRect;
        eVar.f551264f = input;
        eVar.f551266h = matrix;
        eVar.f551265g = i17;
        hVar.f551279d.execute(eVar);
    }
}
