package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes.dex */
public final class e5 extends r45.xk2 implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final r45.zk2 f107825d;

    public e5(r45.zk2 question, r45.xk2 answer) {
        kotlin.jvm.internal.o.g(question, "question");
        kotlin.jvm.internal.o.g(answer, "answer");
        this.f107825d = question;
        set(0, java.lang.Long.valueOf(answer.getLong(0)));
        set(2, java.lang.Integer.valueOf(answer.getInteger(2)));
        set(5, java.lang.Integer.valueOf(answer.getInteger(5)));
        set(1, answer.getString(1));
        set(4, java.lang.Boolean.valueOf(answer.getBoolean(4)));
        set(6, java.lang.Long.valueOf(answer.getLong(6)));
        set(3, java.lang.Integer.valueOf(answer.getInteger(3)));
    }

    @Override // in5.c
    public long getItemId() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
