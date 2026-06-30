package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes4.dex */
public abstract class s {
    public static boolean a(android.view.View view, android.text.Spanned spanned) {
        boolean z17;
        if (view != null && spanned != null && (((z17 = view instanceof android.widget.TextView)) || (view instanceof com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10808xd74620))) {
            int lineCount = z17 ? ((android.widget.TextView) view).getLineCount() : view instanceof com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10808xd74620 ? ((com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10808xd74620) view).m46322x92d2fac5() : 0;
            if (lineCount == 1 && spanned.length() > 500) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.InvalidTextCheck", "error black dot");
                return true;
            }
            for (int i17 = 1; i17 < lineCount; i17++) {
                if (b(view, i17) - b(view, i17 - 1) > 500) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.InvalidTextCheck", "error black dot");
                    return true;
                }
            }
        }
        return false;
    }

    public static int b(android.view.View view, int i17) {
        if (view instanceof android.widget.TextView) {
            android.widget.TextView textView = (android.widget.TextView) view;
            if (textView.getLayout() == null) {
                return 0;
            }
            return textView.getLayout().getLineEnd(i17);
        }
        if (!(view instanceof com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10808xd74620)) {
            return 0;
        }
        com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10808xd74620 c10808xd74620 = (com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10808xd74620) view;
        if (c10808xd74620.m46337x7741c9c2() == null) {
            return 0;
        }
        return c10808xd74620.m46337x7741c9c2().getLineEnd(i17);
    }
}
