package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class s2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.feed.s2 f108967d = new com.tencent.mm.plugin.finder.feed.s2();

    public s2() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        java.util.Map map = com.tencent.mm.plugin.finder.assist.w2.f102643a;
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        long timeInMillis = longValue - new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5)).getTimeInMillis();
        return java.lang.Boolean.valueOf(!(timeInMillis >= 0 && timeInMillis < 86400000));
    }
}
