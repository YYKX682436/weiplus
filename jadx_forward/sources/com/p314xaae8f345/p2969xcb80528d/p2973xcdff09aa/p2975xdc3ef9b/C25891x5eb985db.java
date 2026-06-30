package com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.tavkit.composition.builder.VideoInstructionsBuilder */
/* loaded from: classes16.dex */
public class C25891x5eb985db {

    /* renamed from: builderModel */
    private final com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25887x114f86e f48987xf749a44e;

    /* renamed from: outputInstructions */
    private final java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25916xa699d596> f48988x23a69946 = new java.util.ArrayList();

    /* renamed from: com.tencent.tavkit.composition.builder.VideoInstructionsBuilder$Slice */
    /* loaded from: classes16.dex */
    public static class Slice {

        /* renamed from: layerInstructions */
        private java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75> f48990x826d5d96;

        /* renamed from: timeRange */
        private com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 f48991x16fae70;

        public Slice(com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26, java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75> list) {
            this.f48991x16fae70 = c25738xead39d26;
            this.f48990x826d5d96 = list;
        }
    }

    public C25891x5eb985db(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25887x114f86e c25887x114f86e) {
        this.f48987xf749a44e = c25887x114f86e;
    }

    /* renamed from: buildInstruction */
    private com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25916xa699d596 m98649x25241d40(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25891x5eb985db.Slice slice, java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75> list, java.util.List<java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75>> list2) {
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25916xa699d596 c25916xa699d596 = new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25916xa699d596(m98656x86591926(slice.f48990x826d5d96), slice.f48991x16fae70);
        c25916xa699d596.m98778x98e252e3(m98654x8e2700ec(list2, slice.f48990x826d5d96));
        c25916xa699d596.m98781x3f19ac70(m98655x6caa495e(list, slice.f48990x826d5d96));
        c25916xa699d596.m98777x67f06213(this.f48987xf749a44e.m98623x3119c89f());
        c25916xa699d596.m98780x6132d607(this.f48987xf749a44e.m98632x64078b37().m98574x859cc993());
        c25916xa699d596.m98783xcd6631d4(this.f48987xf749a44e.m98632x64078b37().m98580x56fc9c8());
        c25916xa699d596.m98782xae0a768f(this.f48987xf749a44e.m98632x64078b37().m98578xd2746a1b());
        return c25916xa699d596;
    }

    /* renamed from: buildInstructions */
    private void m98650x7f5f8b33(java.util.List<java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75>> list, java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75> list2, java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25891x5eb985db.Slice> list3) {
        java.util.Iterator<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25891x5eb985db.Slice> it = list3.iterator();
        while (it.hasNext()) {
            this.f48988x23a69946.add(m98649x25241d40(it.next(), list2, list));
        }
    }

    /* renamed from: calculateSlicesForLayerInstructions */
    private static java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25891x5eb985db.Slice> m98651x8b267694(java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75> list) {
        java.util.TreeSet treeSet = new java.util.TreeSet(new java.util.Comparator<com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57>() { // from class: com.tencent.tavkit.composition.builder.VideoInstructionsBuilder.1
            @Override // java.util.Comparator
            public int compare(com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57, com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572) {
                return (int) c25736x76b98a57.sub(c25736x76b98a572).m97233x754a37bb();
            }
        });
        for (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75 c25917xe9e06e75 : list) {
            treeSet.add(c25917xe9e06e75.m98788xdd1fba().m97260x75286aac());
            treeSet.add(c25917xe9e06e75.m98788xdd1fba().m97258xb58839a5());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a57 = (com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57) treeSet.pollFirst();
        java.util.Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 c25736x76b98a572 = (com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57) it.next();
            com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26 c25738xead39d26 = new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25736x76b98a57, c25736x76b98a572.sub(c25736x76b98a57));
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75 c25917xe9e06e752 : list) {
                if (c25917xe9e06e752.m98788xdd1fba().m97258xb58839a5().m97232x31040141() >= c25736x76b98a57.m97232x31040141() && c25917xe9e06e752.m98788xdd1fba().m97260x75286aac().m97232x31040141() <= c25736x76b98a572.m97232x31040141()) {
                    arrayList2.add(c25917xe9e06e752);
                }
            }
            arrayList.add(new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25891x5eb985db.Slice(c25738xead39d26, arrayList2));
            c25736x76b98a57 = c25736x76b98a572;
        }
        return arrayList;
    }

    /* renamed from: concatAndSortLayers */
    private java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75> m98652x53719703(java.util.List<java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75>> list, java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75> list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next());
        }
        arrayList.addAll(list2);
        java.util.Collections.sort(arrayList, new java.util.Comparator<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75>() { // from class: com.tencent.tavkit.composition.builder.VideoInstructionsBuilder.2
            @Override // java.util.Comparator
            public int compare(com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75 c25917xe9e06e75, com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75 c25917xe9e06e752) {
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac = c25917xe9e06e75.m98788xdd1fba().m97260x75286aac();
                com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m97260x75286aac2 = c25917xe9e06e752.m98788xdd1fba().m97260x75286aac();
                if (m97260x75286aac.m97229x22a7969a(m97260x75286aac2)) {
                    return 0;
                }
                return m97260x75286aac.m97238x9f3f7b48(m97260x75286aac2) ? -1 : 1;
            }
        });
        return arrayList;
    }

    /* renamed from: fixLastLayerDuration */
    private void m98653xf862677a(java.util.List<java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75>> list) {
        java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75> list2;
        if (list == null || list.size() != 1 || (list2 = list.get(0)) == null || list2.isEmpty()) {
            return;
        }
        com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75 c25917xe9e06e75 = list2.get(list2.size() - 1);
        com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57 m98573xacbb5a6b = this.f48987xf749a44e.m98632x64078b37().m98573xacbb5a6b();
        if (m98573xacbb5a6b == null) {
            m98573xacbb5a6b = new com.p314xaae8f345.tav.p2957xa228aba5.C25736x76b98a57(1L, 30);
        }
        c25917xe9e06e75.m98792x5d30e02e(new com.p314xaae8f345.tav.p2957xa228aba5.C25738xead39d26(c25917xe9e06e75.m98788xdd1fba().m97260x75286aac(), c25917xe9e06e75.m98788xdd1fba().m97256x51e8b0a().add(m98573xacbb5a6b)));
    }

    /* renamed from: selectChannels */
    private java.util.List<java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75>> m98654x8e2700ec(java.util.List<java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75>> list, java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75> list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75>> it = list.iterator();
        while (it.hasNext()) {
            java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75> m98655x6caa495e = m98655x6caa495e(list2, it.next());
            if (m98655x6caa495e.size() > 0) {
                arrayList.add(m98655x6caa495e);
            }
        }
        return arrayList;
    }

    /* renamed from: selectLayers */
    private java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75> m98655x6caa495e(java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75> list, java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75> list2) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75 c25917xe9e06e75 : list) {
            if (list2.contains(c25917xe9e06e75)) {
                arrayList.add(c25917xe9e06e75);
            }
        }
        return arrayList;
    }

    /* renamed from: trackIDsByLayers */
    private java.util.List<java.lang.Integer> m98656x86591926(java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(it.next().mo96946xfe2e0f70()));
        }
        return arrayList;
    }

    /* renamed from: build */
    public java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25916xa699d596> m98657x59bc66e() {
        java.util.List<java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75>> m98658x22291b0f = m98658x22291b0f();
        java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75> m98659x6f1d83b4 = m98659x6f1d83b4();
        m98650x7f5f8b33(m98658x22291b0f, m98659x6f1d83b4, m98651x8b267694(m98652x53719703(m98658x22291b0f, m98659x6f1d83b4)));
        return this.f48988x23a69946;
    }

    /* renamed from: buildMainLayerInstructions */
    public java.util.List<java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75>> m98658x22291b0f() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25890xc6e057a9> list : this.f48987xf749a44e.m98626x79964e6d()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25890xc6e057a9 c25890xc6e057a9 : list) {
                arrayList2.add(new com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75(c25890xc6e057a9.f48986x9beb71c1.m96163xfe2e0f70(), c25890xc6e057a9.f48985x2ea350));
            }
            arrayList.add(arrayList2);
        }
        m98653xf862677a(arrayList);
        return arrayList;
    }

    /* renamed from: buildOverlayLayerInstructions */
    public java.util.List<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2978x6b0147b.C25917xe9e06e75> m98659x6f1d83b4() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<com.p314xaae8f345.p2969xcb80528d.p2973xcdff09aa.p2975xdc3ef9b.C25892x978041c3> it = this.f48987xf749a44e.m98628xf751499f().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m98662xd0e7e22b());
        }
        return arrayList;
    }
}
