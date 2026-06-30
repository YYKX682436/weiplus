package com.tencent.mm.mm7zip;

/* loaded from: classes4.dex */
public class PropertyInfo {
    public java.lang.String name;
    public com.tencent.mm.mm7zip.PropID propID;
    public java.lang.Class<?> varType;

    public java.lang.String toString() {
        return "name=" + this.name + "; propID=" + this.propID + "; varType=" + this.varType.getCanonicalName();
    }
}
