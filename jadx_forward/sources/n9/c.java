package n9;

/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f417274a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f417275b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f417276c;

    /* renamed from: d, reason: collision with root package name */
    public final long f417277d;

    /* renamed from: e, reason: collision with root package name */
    public final long f417278e;

    /* renamed from: f, reason: collision with root package name */
    public final n9.e f417279f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f417280g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String[] f417281h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.HashMap f417282i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.HashMap f417283j;

    /* renamed from: k, reason: collision with root package name */
    public java.util.List f417284k;

    public c(java.lang.String str, java.lang.String str2, long j17, long j18, n9.e eVar, java.lang.String[] strArr, java.lang.String str3) {
        this.f417274a = str;
        this.f417275b = str2;
        this.f417279f = eVar;
        this.f417281h = strArr;
        this.f417276c = str2 != null;
        this.f417277d = j17;
        this.f417278e = j18;
        str3.getClass();
        this.f417280g = str3;
        this.f417282i = new java.util.HashMap();
        this.f417283j = new java.util.HashMap();
    }

    public static n9.c a(java.lang.String str) {
        return new n9.c(null, str.replaceAll(com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "");
    }

    public static android.text.SpannableStringBuilder c(java.lang.String str, java.util.Map map) {
        if (!map.containsKey(str)) {
            map.put(str, new android.text.SpannableStringBuilder());
        }
        return (android.text.SpannableStringBuilder) map.get(str);
    }

    public final void b(java.util.TreeSet treeSet, boolean z17) {
        boolean equals = "p".equals(this.f417274a);
        if (z17 || equals) {
            long j17 = this.f417277d;
            if (j17 != -9223372036854775807L) {
                treeSet.add(java.lang.Long.valueOf(j17));
            }
            long j18 = this.f417278e;
            if (j18 != -9223372036854775807L) {
                treeSet.add(java.lang.Long.valueOf(j18));
            }
        }
        if (this.f417284k == null) {
            return;
        }
        for (int i17 = 0; i17 < ((java.util.ArrayList) this.f417284k).size(); i17++) {
            ((n9.c) ((java.util.ArrayList) this.f417284k).get(i17)).b(treeSet, z17 || equals);
        }
    }

    public final void d(java.util.Map map, java.util.Map map2) {
        for (java.util.Map.Entry entry : this.f417283j.entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            java.util.HashMap hashMap = this.f417282i;
            int intValue = hashMap.containsKey(str) ? ((java.lang.Integer) hashMap.get(str)).intValue() : 0;
            android.text.SpannableStringBuilder spannableStringBuilder = (android.text.SpannableStringBuilder) map2.get(str);
            int intValue2 = ((java.lang.Integer) entry.getValue()).intValue();
            if (intValue != intValue2) {
                n9.e eVar = this.f417279f;
                java.lang.String[] strArr = this.f417281h;
                if (eVar == null && strArr == null) {
                    eVar = null;
                } else if (eVar == null && strArr.length == 1) {
                    eVar = (n9.e) map.get(strArr[0]);
                } else if (eVar == null && strArr.length > 1) {
                    eVar = new n9.e();
                    for (java.lang.String str2 : strArr) {
                        eVar.a((n9.e) map.get(str2));
                    }
                } else if (eVar != null && strArr != null && strArr.length == 1) {
                    eVar.a((n9.e) map.get(strArr[0]));
                } else if (eVar != null && strArr != null && strArr.length > 1) {
                    for (java.lang.String str3 : strArr) {
                        eVar.a((n9.e) map.get(str3));
                    }
                }
                if (eVar != null) {
                    int i17 = eVar.f417298h;
                    if (((i17 == -1 && eVar.f417299i == -1) ? -1 : (i17 == 1 ? (char) 1 : (char) 0) | (eVar.f417299i == 1 ? (char) 2 : (char) 0)) != -1) {
                        int i18 = eVar.f417298h;
                        spannableStringBuilder.setSpan(new android.text.style.StyleSpan((i18 == -1 && eVar.f417299i == -1) ? -1 : (i18 == 1 ? 1 : 0) | (eVar.f417299i == 1 ? 2 : 0)), intValue, intValue2, 33);
                    }
                    if (eVar.f417296f == 1) {
                        spannableStringBuilder.setSpan(new android.text.style.StrikethroughSpan(), intValue, intValue2, 33);
                    }
                    if (eVar.f417297g == 1) {
                        spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), intValue, intValue2, 33);
                    }
                    if (eVar.f417293c) {
                        if (!eVar.f417293c) {
                            throw new java.lang.IllegalStateException("Font color has not been defined.");
                        }
                        spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(eVar.f417292b), intValue, intValue2, 33);
                    }
                    if (eVar.f417295e) {
                        if (!eVar.f417295e) {
                            throw new java.lang.IllegalStateException("Background color has not been defined.");
                        }
                        spannableStringBuilder.setSpan(new android.text.style.BackgroundColorSpan(eVar.f417294d), intValue, intValue2, 33);
                    }
                    if (eVar.f417291a != null) {
                        spannableStringBuilder.setSpan(new android.text.style.TypefaceSpan(eVar.f417291a), intValue, intValue2, 33);
                    }
                    if (eVar.f417303m != null) {
                        spannableStringBuilder.setSpan(new android.text.style.AlignmentSpan.Standard(eVar.f417303m), intValue, intValue2, 33);
                    }
                    int i19 = eVar.f417300j;
                    if (i19 == 1) {
                        spannableStringBuilder.setSpan(new android.text.style.AbsoluteSizeSpan((int) eVar.f417301k, true), intValue, intValue2, 33);
                    } else if (i19 == 2) {
                        spannableStringBuilder.setSpan(new android.text.style.RelativeSizeSpan(eVar.f417301k), intValue, intValue2, 33);
                    } else if (i19 == 3) {
                        spannableStringBuilder.setSpan(new android.text.style.RelativeSizeSpan(eVar.f417301k / 100.0f), intValue, intValue2, 33);
                    }
                }
            }
            int i27 = 0;
            while (true) {
                java.util.List list = this.f417284k;
                if (i27 < (list == null ? 0 : ((java.util.ArrayList) list).size())) {
                    java.util.List list2 = this.f417284k;
                    if (list2 == null) {
                        throw new java.lang.IndexOutOfBoundsException();
                    }
                    ((n9.c) ((java.util.ArrayList) list2).get(i27)).d(map, map2);
                    i27++;
                }
            }
        }
    }

    public final void e(long j17, boolean z17, java.lang.String str, java.util.Map map) {
        java.util.HashMap hashMap = this.f417282i;
        hashMap.clear();
        java.util.HashMap hashMap2 = this.f417283j;
        hashMap2.clear();
        java.lang.String str2 = this.f417280g;
        java.lang.String str3 = "".equals(str2) ? str : str2;
        if (this.f417276c && z17) {
            c(str3, map).append((java.lang.CharSequence) this.f417275b);
            return;
        }
        java.lang.String str4 = this.f417274a;
        if ("br".equals(str4) && z17) {
            c(str3, map).append('\n');
            return;
        }
        if ("metadata".equals(str4)) {
            return;
        }
        long j18 = this.f417277d;
        long j19 = this.f417278e;
        if (!((j18 == -9223372036854775807L && j19 == -9223372036854775807L) || (j18 <= j17 && j19 == -9223372036854775807L) || ((j18 == -9223372036854775807L && j17 < j19) || (j18 <= j17 && j17 < j19)))) {
            return;
        }
        boolean equals = "p".equals(str4);
        for (java.util.Map.Entry entry : map.entrySet()) {
            hashMap.put(entry.getKey(), java.lang.Integer.valueOf(((android.text.SpannableStringBuilder) entry.getValue()).length()));
        }
        int i17 = 0;
        while (true) {
            java.util.List list = this.f417284k;
            if (i17 >= (list == null ? 0 : ((java.util.ArrayList) list).size())) {
                if (equals) {
                    android.text.SpannableStringBuilder c17 = c(str3, map);
                    int length = c17.length();
                    do {
                        length--;
                        if (length < 0) {
                            break;
                        }
                    } while (c17.charAt(length) == ' ');
                    if (length >= 0 && c17.charAt(length) != '\n') {
                        c17.append('\n');
                    }
                }
                for (java.util.Map.Entry entry2 : map.entrySet()) {
                    hashMap2.put(entry2.getKey(), java.lang.Integer.valueOf(((android.text.SpannableStringBuilder) entry2.getValue()).length()));
                }
                return;
            }
            java.util.List list2 = this.f417284k;
            if (list2 == null) {
                throw new java.lang.IndexOutOfBoundsException();
            }
            ((n9.c) ((java.util.ArrayList) list2).get(i17)).e(j17, z17 || equals, str3, map);
            i17++;
        }
    }
}
