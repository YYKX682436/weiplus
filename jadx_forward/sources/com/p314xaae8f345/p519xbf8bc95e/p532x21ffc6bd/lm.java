package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes8.dex */
public final class lm {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Random f131866a = new java.util.Random();

    private static java.util.List<android.graphics.PointF> a(java.util.List<android.graphics.PointF> list, double d17) {
        int size = list.size();
        if (list.isEmpty() || size < 3) {
            return list;
        }
        int size2 = list.size() - 1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(0);
        int i17 = size2;
        while (list.get(0).equals(list.get(i17))) {
            i17--;
            if (i17 <= 0) {
                return list;
            }
        }
        arrayList.add(java.lang.Integer.valueOf(i17));
        a(list, 0, i17, d17, arrayList);
        b(arrayList, 0, arrayList.size() - 1, new java.util.Comparator<java.lang.Integer>() { // from class: com.tencent.mapsdk.internal.lm.1
            private static int a(java.lang.Integer num, java.lang.Integer num2) {
                return num.intValue() - num2.intValue();
            }

            @Override // java.util.Comparator
            public final /* synthetic */ int compare(java.lang.Integer num, java.lang.Integer num2) {
                return num.intValue() - num2.intValue();
            }
        });
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            arrayList2.add(list.get(((java.lang.Integer) arrayList.get(i18)).intValue()));
        }
        return arrayList2;
    }

    private static <E> void b(java.util.ArrayList<E> arrayList, int i17, int i18, java.util.Comparator<? super E> comparator) {
        while (i18 > i17) {
            int nextInt = f131866a.nextInt((i18 - i17) + 1) + i17;
            E e17 = arrayList.get(nextInt);
            a(arrayList, nextInt, i18);
            int i19 = i17;
            int i27 = i19;
            while (i19 < i18) {
                if (comparator.compare(arrayList.get(i19), e17) <= 0) {
                    a(arrayList, i27, i19);
                    i27++;
                }
                i19++;
            }
            a(arrayList, i27, i18);
            b(arrayList, i17, i27 - 1, comparator);
            i17 = i27 + 1;
        }
    }

    private static <E> void a(java.util.ArrayList<E> arrayList, int i17, int i18) {
        E e17 = arrayList.get(i17);
        arrayList.set(i17, arrayList.get(i18));
        arrayList.set(i18, e17);
    }

    private static <E> int a(java.util.ArrayList<E> arrayList, int i17, int i18, java.util.Comparator<? super E> comparator) {
        int nextInt = f131866a.nextInt((i18 - i17) + 1) + i17;
        E e17 = arrayList.get(nextInt);
        a(arrayList, nextInt, i18);
        int i19 = i17;
        while (i17 < i18) {
            if (comparator.compare(arrayList.get(i17), e17) <= 0) {
                a(arrayList, i19, i17);
                i19++;
            }
            i17++;
        }
        a(arrayList, i19, i18);
        return i19;
    }

    private static <E> void a(java.util.ArrayList<E> arrayList, java.util.Comparator<? super E> comparator) {
        b(arrayList, 0, arrayList.size() - 1, comparator);
    }

    private static void a(java.util.List<android.graphics.PointF> list, int i17, int i18, double d17, java.util.ArrayList<java.lang.Integer> arrayList) {
        double d18;
        int i19 = i17;
        while (true) {
            int i27 = 0;
            double d19 = 0.0d;
            for (int i28 = i19; i28 < i18; i28++) {
                android.graphics.PointF pointF = list.get(i19);
                android.graphics.PointF pointF2 = list.get(i18);
                android.graphics.PointF pointF3 = list.get(i28);
                if (pointF.equals(pointF2) || pointF3.equals(pointF) || pointF3.equals(pointF2)) {
                    d18 = 0.0d;
                } else {
                    float f17 = pointF.x;
                    float f18 = pointF2.y;
                    float f19 = pointF2.x;
                    float f27 = pointF3.y;
                    float f28 = pointF3.x;
                    float f29 = pointF.y;
                    d18 = (java.lang.Math.abs(((((((f17 * f18) + (f19 * f27)) + (f28 * f29)) - (f19 * f29)) - (f28 * f18)) - (f17 * f27)) * 0.5d) * 2.0d) / java.lang.Math.sqrt(java.lang.Math.pow(pointF.x - pointF2.x, 2.0d) + java.lang.Math.pow(pointF.y - pointF2.y, 2.0d));
                }
                if (d18 > d19) {
                    i27 = i28;
                    d19 = d18;
                }
            }
            if (d19 <= d17 || i27 == 0) {
                return;
            }
            arrayList.add(java.lang.Integer.valueOf(i27));
            a(list, i19, i27, d17, arrayList);
            i19 = i27;
        }
    }

    private static double a(android.graphics.PointF pointF, android.graphics.PointF pointF2, android.graphics.PointF pointF3) {
        if (pointF.equals(pointF2) || pointF3.equals(pointF) || pointF3.equals(pointF2)) {
            return 0.0d;
        }
        float f17 = pointF.x;
        float f18 = pointF2.y;
        float f19 = pointF2.x;
        float f27 = pointF3.y;
        float f28 = pointF3.x;
        float f29 = pointF.y;
        return (java.lang.Math.abs(((((((f17 * f18) + (f19 * f27)) + (f28 * f29)) - (f19 * f29)) - (f28 * f18)) - (f17 * f27)) * 0.5d) * 2.0d) / java.lang.Math.sqrt(java.lang.Math.pow(pointF.x - pointF2.x, 2.0d) + java.lang.Math.pow(pointF.y - pointF2.y, 2.0d));
    }
}
