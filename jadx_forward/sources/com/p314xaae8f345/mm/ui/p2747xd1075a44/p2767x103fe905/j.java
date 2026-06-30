package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905;

/* loaded from: classes10.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f294010a = false;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f294011b = true;

    public static void a(android.content.Context context, java.lang.String str, java.lang.String str2) {
        if (f294011b) {
            int i17 = al5.u4.f87591t;
            al5.t4 t4Var = new al5.t4(context);
            t4Var.f87575e = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oep);
            t4Var.e(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            boolean z17 = true;
            t4Var.f87583m = true;
            if (str != null) {
                int length = str.length();
                int i18 = 0;
                while (true) {
                    if (i18 >= length) {
                        break;
                    }
                    int codePointAt = str.codePointAt(i18);
                    if (!java.lang.Character.isWhitespace(codePointAt)) {
                        z17 = false;
                        break;
                    }
                    i18 += java.lang.Character.charCount(codePointAt);
                }
                if (!z17) {
                    t4Var.a(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oei));
                    t4Var.h(str, str2);
                    return;
                }
            }
            t4Var.h(null, str2);
        }
    }

    public static void b(android.content.Context context, android.view.View view, java.lang.String str, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h hVar) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.f fVar = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.f(context, view);
        fVar.f294002c = str;
        fVar.f294003d = 1500;
        if (!f294011b) {
            if (hVar != null) {
                fVar.f294000a.f294007c = hVar;
            }
            fVar.a();
            return;
        }
        int i17 = al5.u4.f87591t;
        al5.t4 t4Var = new al5.t4(context);
        t4Var.f87575e = fVar.f294002c;
        t4Var.e(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
        t4Var.a(null);
        t4Var.f87580j = hVar;
        t4Var.g();
    }

    public static void c(java.lang.String str, java.lang.String str2, android.content.Context context, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.g gVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2767x103fe905.h hVar) {
        if (f294011b) {
            int i17 = al5.u4.f87591t;
            al5.t4 t4Var = new al5.t4(context);
            t4Var.f87575e = str;
            t4Var.e(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
            t4Var.a(str2);
            t4Var.f87571a.f87547b = gVar;
            t4Var.f87580j = hVar;
            t4Var.g();
        }
    }
}
