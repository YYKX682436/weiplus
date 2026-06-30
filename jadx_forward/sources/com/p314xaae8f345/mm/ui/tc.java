package com.p314xaae8f345.mm.ui;

/* loaded from: classes.dex */
public class tc implements com.p314xaae8f345.mm.ui.ad {
    @Override // com.p314xaae8f345.mm.ui.ad, j45.i
    public boolean b(android.content.Context context, java.lang.String str, android.content.Intent intent, int i17, com.p314xaae8f345.mm.ui.x7 x7Var) {
        java.util.Iterator it = ((fs.c) fs.g.f(com.p314xaae8f345.mm.ui.cd.class)).all().iterator();
        while (it.hasNext()) {
            if (((com.p314xaae8f345.mm.ui.cd) ((fs.q) it.next()).get()).b(context, str, intent, i17, x7Var)) {
                return true;
            }
        }
        return false;
    }
}
