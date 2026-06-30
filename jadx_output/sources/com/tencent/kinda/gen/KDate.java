package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public final class KDate {
    public int mDay;
    public int mMonth;
    public int mYear;

    public KDate() {
    }

    public KDate(int i17, int i18, int i19) {
        this.mYear = i17;
        this.mMonth = i18;
        this.mDay = i19;
    }

    public int getDay() {
        return this.mDay;
    }

    public int getMonth() {
        return this.mMonth;
    }

    public int getYear() {
        return this.mYear;
    }

    public java.lang.String toString() {
        return "KDate{mYear=" + this.mYear + ",mMonth=" + this.mMonth + ",mDay=" + this.mDay + "}";
    }
}
