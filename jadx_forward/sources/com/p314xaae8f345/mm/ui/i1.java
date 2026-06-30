package com.p314xaae8f345.mm.ui;

/* loaded from: classes5.dex */
public abstract class i1 {

    /* renamed from: a, reason: collision with root package name */
    public static android.widget.EditText f290424a;

    /* renamed from: b, reason: collision with root package name */
    public static android.text.TextWatcher f290425b;

    /* renamed from: c, reason: collision with root package name */
    public static int f290426c;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.LinkedHashMap f290427d = new java.util.LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static boolean f290428e = false;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f290429f = false;

    public static java.util.HashMap a(java.lang.String str) {
        int indexOf;
        int indexOf2;
        java.util.LinkedHashMap linkedHashMap = f290427d;
        if (linkedHashMap != null && linkedHashMap.size() > 0) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            int i17 = 0;
            int i18 = 0;
            while (i18 < str.length() && (indexOf = str.indexOf("@", i18)) != -1 && (indexOf2 = str.indexOf(8197, indexOf)) != -1 && indexOf2 - indexOf <= 40) {
                java.lang.String substring = str.substring(indexOf + 1, indexOf2);
                if (substring.contains("@")) {
                    substring = substring.substring(substring.indexOf("@") + 1);
                }
                linkedList.add(substring);
                i18 = indexOf2 + 1;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AtSomeOneHelper", "after split @ :%s", linkedList);
            if (linkedList.size() <= 0) {
                linkedHashMap.clear();
                return null;
            }
            if (linkedHashMap != null && linkedHashMap.size() > 0) {
                java.util.LinkedList linkedList2 = new java.util.LinkedList();
                for (java.util.Map.Entry entry : linkedHashMap.entrySet()) {
                    java.lang.String str2 = (java.lang.String) entry.getKey();
                    java.lang.String str3 = (java.lang.String) entry.getValue();
                    if (i17 < linkedList.size() && str2.equals(linkedList.get(i17))) {
                        linkedList2.add(str3);
                    }
                    i17++;
                }
                java.util.HashMap hashMap = new java.util.HashMap(1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AtSomeOneHelper", "[getAtSomebodyUsernames]  atList size:%s", java.lang.Integer.valueOf(linkedList2.size()));
                hashMap.put("atuserlist", "<![CDATA[" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(linkedList2, ",") + "]]>");
                linkedHashMap.clear();
                return hashMap;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AtSomeOneHelper", "list is null or size 0");
        }
        return null;
    }

    public static void b() {
        android.text.TextWatcher textWatcher;
        android.widget.EditText editText = f290424a;
        if (editText != null && (textWatcher = f290425b) != null) {
            editText.removeTextChangedListener(textWatcher);
        }
        f290426c = 0;
        f290424a = null;
        f290425b = null;
    }

    public static void c(android.widget.EditText editText, android.content.Context context, java.lang.String str) {
        f290424a = editText;
        com.p314xaae8f345.mm.ui.h1 h1Var = new com.p314xaae8f345.mm.ui.h1(context, str);
        f290425b = h1Var;
        if (editText != null) {
            editText.addTextChangedListener(h1Var);
            f290424a.setOnKeyListener(new com.p314xaae8f345.mm.ui.g1());
        }
    }
}
