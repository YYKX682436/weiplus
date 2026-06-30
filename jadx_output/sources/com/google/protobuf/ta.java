package com.google.protobuf;

/* loaded from: classes16.dex */
public final class ta {

    /* renamed from: a, reason: collision with root package name */
    public com.google.protobuf.ua f45558a;

    public com.google.protobuf.ua a() {
        com.google.protobuf.ua uaVar = this.f45558a;
        java.util.List list = uaVar.f45586a;
        if (list == null) {
            uaVar.f45586a = java.util.Collections.emptyList();
        } else {
            uaVar.f45586a = java.util.Collections.unmodifiableList(list);
        }
        com.google.protobuf.ua uaVar2 = this.f45558a;
        java.util.List list2 = uaVar2.f45587b;
        if (list2 == null) {
            uaVar2.f45587b = java.util.Collections.emptyList();
        } else {
            uaVar2.f45587b = java.util.Collections.unmodifiableList(list2);
        }
        com.google.protobuf.ua uaVar3 = this.f45558a;
        java.util.List list3 = uaVar3.f45588c;
        if (list3 == null) {
            uaVar3.f45588c = java.util.Collections.emptyList();
        } else {
            uaVar3.f45588c = java.util.Collections.unmodifiableList(list3);
        }
        com.google.protobuf.ua uaVar4 = this.f45558a;
        java.util.List list4 = uaVar4.f45589d;
        if (list4 == null) {
            uaVar4.f45589d = java.util.Collections.emptyList();
        } else {
            uaVar4.f45589d = java.util.Collections.unmodifiableList(list4);
        }
        com.google.protobuf.ua uaVar5 = this.f45558a;
        java.util.List list5 = uaVar5.f45590e;
        if (list5 == null) {
            uaVar5.f45590e = java.util.Collections.emptyList();
        } else {
            uaVar5.f45590e = java.util.Collections.unmodifiableList(list5);
        }
        com.google.protobuf.ua uaVar6 = this.f45558a;
        this.f45558a = null;
        return uaVar6;
    }

    public com.google.protobuf.ta b(com.google.protobuf.ua uaVar) {
        if (!uaVar.f45586a.isEmpty()) {
            com.google.protobuf.ua uaVar2 = this.f45558a;
            if (uaVar2.f45586a == null) {
                uaVar2.f45586a = new java.util.ArrayList();
            }
            this.f45558a.f45586a.addAll(uaVar.f45586a);
        }
        if (!uaVar.f45587b.isEmpty()) {
            com.google.protobuf.ua uaVar3 = this.f45558a;
            if (uaVar3.f45587b == null) {
                uaVar3.f45587b = new java.util.ArrayList();
            }
            this.f45558a.f45587b.addAll(uaVar.f45587b);
        }
        if (!uaVar.f45588c.isEmpty()) {
            com.google.protobuf.ua uaVar4 = this.f45558a;
            if (uaVar4.f45588c == null) {
                uaVar4.f45588c = new java.util.ArrayList();
            }
            this.f45558a.f45588c.addAll(uaVar.f45588c);
        }
        if (!uaVar.f45589d.isEmpty()) {
            com.google.protobuf.ua uaVar5 = this.f45558a;
            if (uaVar5.f45589d == null) {
                uaVar5.f45589d = new java.util.ArrayList();
            }
            this.f45558a.f45589d.addAll(uaVar.f45589d);
        }
        if (!uaVar.f45590e.isEmpty()) {
            com.google.protobuf.ua uaVar6 = this.f45558a;
            if (uaVar6.f45590e == null) {
                uaVar6.f45590e = new java.util.ArrayList();
            }
            this.f45558a.f45590e.addAll(uaVar.f45590e);
        }
        return this;
    }
}
