package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes12.dex */
public class vd {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f292387a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f292388b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.ArrayList f292389c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f292390d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f292391e;

    public vd(android.widget.EditText editText) {
        this.f292388b = new java.lang.ref.WeakReference(editText);
    }

    public static java.util.List a(java.lang.String str, java.util.ArrayList arrayList) {
        int indexOf;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || arrayList == null || arrayList.size() == 0) {
            return null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int length = str.length();
        int i17 = 0;
        while (true) {
            if (i17 > length) {
                break;
            }
            java.util.Iterator it = arrayList.iterator();
            int i18 = length;
            int i19 = 0;
            while (it.hasNext()) {
                java.lang.String str2 = (java.lang.String) it.next();
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) && (indexOf = str.indexOf(str2, i17)) >= 0 && (indexOf < i18 || (indexOf == i18 && str2.length() > i19))) {
                    i19 = str2.length();
                    i18 = indexOf;
                }
            }
            if (i18 < length) {
                if (i18 > i17) {
                    arrayList2.add(new com.p314xaae8f345.mm.ui.p2740x696c9db.ud(i17, i18 - i17, false));
                }
                arrayList2.add(new com.p314xaae8f345.mm.ui.p2740x696c9db.ud(i18, i19, true));
                i17 = i18 + i19;
            } else if (i18 > i17) {
                arrayList2.add(new com.p314xaae8f345.mm.ui.p2740x696c9db.ud(i17, i18 - i17, false));
            }
        }
        return arrayList2;
    }

    public static boolean b(android.widget.EditText editText, java.util.ArrayList arrayList) {
        int i17;
        java.lang.String obj = editText.getText().toString();
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.util.List a17 = a(obj, arrayList);
        if (a17 != null) {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) a17;
            if (arrayList2.size() > 0) {
                int selectionStart = editText.getSelectionStart();
                int selectionEnd = editText.getSelectionEnd();
                android.content.Context context = editText.getContext();
                android.text.TextPaint paint = editText.getPaint();
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.ui.p2740x696c9db.ud udVar = (com.p314xaae8f345.mm.ui.p2740x696c9db.ud) it.next();
                    int i18 = udVar.f292362a;
                    int i19 = udVar.f292363b;
                    if (i18 < 0 || i19 <= 0 || (i17 = i18 + i19) > obj.length()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WordsChecker", "start : %d, length : %d.", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                    } else if (udVar.f292364c) {
                        java.lang.String substring = obj.substring(i18, i17);
                        android.text.SpannableString spannableString = new android.text.SpannableString(substring);
                        spannableString.setSpan(new android.text.style.ImageSpan(new com.p314xaae8f345.mm.ui.p2740x696c9db.td(context, substring, paint), 0), 0, substring.length(), 33);
                        spannableStringBuilder.append((java.lang.CharSequence) spannableString);
                    } else {
                        spannableStringBuilder.append((java.lang.CharSequence) obj.substring(i18, i17));
                    }
                }
                if (spannableStringBuilder.length() <= 0) {
                    return true;
                }
                editText.setText(spannableStringBuilder);
                editText.setTextKeepState(spannableStringBuilder);
                if (selectionStart != selectionEnd || selectionStart < 0) {
                    return true;
                }
                editText.setSelection(selectionStart);
                return true;
            }
        }
        return false;
    }

    public final com.p314xaae8f345.mm.ui.p2740x696c9db.ud c(android.text.Editable editable, int i17) {
        java.util.List list = this.f292387a;
        if (list == null) {
            return null;
        }
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.ud udVar = (com.p314xaae8f345.mm.ui.p2740x696c9db.ud) it.next();
            int i18 = udVar.f292362a;
            if (i17 <= udVar.f292363b + i18 && i17 > i18) {
                return udVar;
            }
        }
        return null;
    }
}
