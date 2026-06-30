package cr0;

/* loaded from: classes11.dex */
public final class p2 implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        jz5.l lVar = (jz5.l) obj;
        int intValue = ((java.lang.Number) lVar.f384366d).intValue();
        long time = ((android.os.health.TimerStat) lVar.f384367e).getTime();
        if (intValue == 10061) {
            time /= 1000;
        }
        java.lang.Long valueOf = java.lang.Long.valueOf(time);
        jz5.l lVar2 = (jz5.l) obj2;
        int intValue2 = ((java.lang.Number) lVar2.f384366d).intValue();
        android.os.health.TimerStat timerStat = (android.os.health.TimerStat) lVar2.f384367e;
        return mz5.a.b(valueOf, java.lang.Long.valueOf(intValue2 == 10061 ? timerStat.getTime() / 1000 : timerStat.getTime()));
    }
}
